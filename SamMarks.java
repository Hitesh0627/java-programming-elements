public class SamMarks {
    public static void main(String[] args) {
        // Define the marks in each subject
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        
        // Calculate the total marks
        int totalMarks = mathsMark + physicsMark + chemistryMark;
        
        // Calculate the average percentage
        double averagePercentage = (totalMarks / 3.0);
        
        // Print the result
        System.out.println("Sam's average mark in PCM is " + averagePercentage);
    }
}
