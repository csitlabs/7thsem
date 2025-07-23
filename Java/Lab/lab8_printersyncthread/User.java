public class User extends Thread {
    private Printer printer;
    private String userName;

    public User(Printer printer, String name) {
        this.printer = printer;
        this.userName = name;
    }

    @Override
    public void run() {
        printer.printDocument(userName);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        User user1 = new User(printer, "User1");
        User user2 = new User(printer, "User2");
        User user3 = new User(printer, "User3");

        user1.start();
        user2.start();
        user3.start();

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");
    }

}
