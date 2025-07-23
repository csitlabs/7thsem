import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }

        double average = (double) sum / n;

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
