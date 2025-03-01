import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();  // User input for unit price

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();  // User input for quantity

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
