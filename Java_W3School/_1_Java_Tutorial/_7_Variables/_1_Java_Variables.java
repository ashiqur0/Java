/*
Java : Java Variables
*/ 
package Java_W3School._1_Java_Tutorial._7_Variables;

public class _1_Java_Variables {
    public static void main(String[] args) {
        // Declaring and initializing Variables
        String name = "Samiul";
        int roll = 1;
        float gpa = 3.88f;
        char grade = 'A';
        boolean isPassed = true;

        // Update values to existign variables
        name = "Nawshin";
        roll = 2;
        gpa = 3.78f;
        grade = 'A';
        isPassed = false;

        // Final Variables : the value is constant (unchangable)
        final int marks = 98;
        System.out.println(name + " " + roll + " " + gpa + " " + grade + " " + isPassed + " " + marks);
    }
}
