import java.util.Scanner;

public class DivisibleBy7And13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check for divisibility by both 7 and 13
        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println("The number is divisible by both 7 and 13.");

            // Calculate and display quotient and remainder for 7
            int quotientBy7 = number / 7;
            int remainderBy7 = number % 7;
            System.out.println("Quotient when divided by 7: " + quotientBy7);
            System.out.println("Remainder when divided by 7: " + remainderBy7);

            // Calculate and display quotient and remainder for 13
            int quotientBy13 = number / 13;
            int remainderBy13 = number % 13;
            System.out.println("Quotient when divided by 13: " + quotientBy13);
            System.out.println("Remainder when divided by 13: " + remainderBy13);
        } else {
            System.out.println("The number is not divisible by both 7 and 13.");
        }

        scanner.close();
    }
}