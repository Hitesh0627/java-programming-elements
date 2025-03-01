public class PenDistributor {
    public static void main(String[] args) {
        // Given values
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents; // Division for equal distribution
        int remainingPens = totalPens % totalStudents; // Modulus for remaining pens

        // Print the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
