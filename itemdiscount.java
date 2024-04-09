
import java.util.Scanner;

public class ItemDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get quantity and price
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item (in Rs.): ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total price before discount
        double totalPrice = quantity * pricePerItem;

        // Calculate and apply discount
        double discount = 0;
        if (quantity > 50) {
            discount = totalPrice * 0.1; // 10% discount
        } else if (quantity >= 25) {
            discount = totalPrice * 0.05; // 5% discount
        }

        // Calculate final price after discount
        double finalPrice = totalPrice - discount;

        // Print results
        System.out.println("Total price before discount: Rs. " + totalPrice);
        if (discount > 0) {
            System.out.println("Discount applied: Rs. " + discount);
        }
        System.out.println("Total expenses: Rs. " + finalPrice);

        scanner.close();
    }
}
