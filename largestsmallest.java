import java.util.Scanner;

public class LargestSmallestAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int number;
        int count = 0;  // To track the number of entries
        int sum = 0;     // To calculate the sum of all numbers
        int max = Integer.MIN_VALUE;  // Initialize max to minimum possible integer
        int min = Integer.MAX_VALUE;  // Initialize min to maximum possible integer

        // Loop until user enters -1
        do {
            System.out.print("Enter a number (or -1 to stop): ");
            number = scanner.nextInt();

            if (number != -1) {  // Ignore -1 (sentinel value)
                count++;
                sum += number;

                // Update max and min for valid entries
                max = Math.max(max, number);  // Use Math.max for efficient max update
                min = Math.min(min, number);  // Use Math.min for efficient min update
            }
        } while (number != -1);

        scanner.close();

        // Check if any valid numbers were entered (excluding -1)
        if (count > 0) {
            double average = (double) sum / count;  // Cast to double for accurate average

            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}