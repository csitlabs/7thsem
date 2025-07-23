import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");

        Scanner sr = new Scanner(System.in);
        try {
            System.out.print("Enter size of array: ");
            // Scanner sr = new Scanner(System.in); //To close the sr object, sr must be defined outside try block
            int n = sr.nextInt();
            int [] a = new int[n];
    
            System.out.print("Enter elements of the array: ");
    
            for (int i = 0; i < a.length ; i++ ){
                a[i] = sr.nextInt();
            }
    
            for (int x : a) {
                System.out.print("Elements in the array are:" + x + "\t" );
            }
        } catch(Exception e)
        {
         System.out.println("Invalid Input!!");
        } finally {
        System.out.println("\n Completed!");
        sr.close(); // Object is closed here
        }
    }
}
