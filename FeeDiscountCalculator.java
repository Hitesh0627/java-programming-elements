import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the fee and discount percentage
        System.out.print("Enter the student fee (in INR): ");
        double fee = input.nextDouble();  // User input for fee
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();  // User input for discount percentage

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Calculate the final discounted fee
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        input.close();
    }
}
