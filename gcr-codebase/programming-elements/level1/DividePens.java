public class DividePens {
    public static void main(String[] args) {
        // Define the fixed variables
        int totalPens = 14;
        int students = 3;
        
        // Calculate how many pens each student gets (integer division)
        int pensPerStudent = totalPens / students;
        
        // Calculate the remainder using the modulus operator
        int remainingPens = totalPens % students;
        
        // Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}