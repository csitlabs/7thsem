public class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! You only have Rs. " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: Rs. " + balance);
        }
    }
}
