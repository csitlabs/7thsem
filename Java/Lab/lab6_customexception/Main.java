import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        scanner.close();

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");
    }
}
