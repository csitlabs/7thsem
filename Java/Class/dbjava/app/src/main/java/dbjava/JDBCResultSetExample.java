package dbjava;

import java.sql.*;

public class JDBCResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db"; // Your DB name
        String user = "root"; // Your DB username
        String password = ""; // Your DB password

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            )
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 1: Create table if not exists
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS students (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(50),
                    grade INT
                );
                """;
            stmt.executeUpdate(createTableSQL);

            // Step 2: Insert sample records (if needed)
            stmt.executeUpdate("""
                INSERT INTO students (name, grade) 
                VALUES ('Alice', 85), ('Bob', 78), ('Charlie', 90)
                """);

            // Step 3: Scrollable ResultSet - Display forward and backward
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            
            System.out.println("---- Forward Direction ----");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + 
                    rs.getString("name") + " " + 
                    rs.getInt("grade"));
            }
            
            System.out.println("---- Backward Direction ----");
            while (rs.previous()) {
                System.out.println(rs.getInt("id") + " " + 
                    rs.getString("name") + " " + 
                    rs.getInt("grade"));
            }

            // Step 4: Move to 2nd row and display
            if (rs.absolute(2)) {
                System.out.println("---- Second Row ----");
                System.out.println(rs.getInt("id") + " " + 
                    rs.getString("name") + " " + 
                    rs.getInt("grade"));
            }

            // Step 5: Updatable ResultSet
            Statement updatableStmt = con.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );
            ResultSet updatableRs = updatableStmt.executeQuery("SELECT * FROM students");

            // Update grade of first record
            if (updatableRs.first()) {
                updatableRs.updateInt("grade", 95);
                updatableRs.updateRow();
                System.out.println("Updated grade of first student to 95");
            }

            // Insert a new student
            updatableRs.moveToInsertRow();
            updatableRs.updateString("name", "Bimochan");
            updatableRs.updateInt("grade", 71);
            updatableRs.insertRow();
            System.out.println("Inserted new student: Bimochan");

            // Delete the last record
            if (updatableRs.last()) {
                System.out.println("Deleting student: " + updatableRs.getString("name"));
                updatableRs.deleteRow();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}