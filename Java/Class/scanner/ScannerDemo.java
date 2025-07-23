package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        System.out.println("You have entered: " + a);
        sr.close();
    }
}
