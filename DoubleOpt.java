import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the value of a, b, and c as double
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Perform the operations
        double result1 = a + b * c; // Operator precedence: b * c first, then a + (result)
        double result2 = a * b + c; // Operator precedence: a * b first, then (result) + c
        double result3 = c + a / b; // Operator precedence: a / b first, then c + (result)
        double result4 = a % b + c; // Operator precedence: a % b first, then (result) + c

        
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n", result1, result2, result3, result4);
        scanner.close();
    }
}
