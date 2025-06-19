/*
Java Operators : Logical Operators
    Arithmetic Operators:
    Assignment Operators:
    Comparison Operators: 
    Logical Operators: 
        Logical AND: &&
        Logical OR: ||
        Logical NOT: !
    Bitwise Operators: 
*/

package Java_W3School._1_Java_Tutorial._10_Operators;

public class _4_Logical_Operators {
    public static void main(String[] args) {

        // Logical Operators
        System.out.println("Logical AND: " + (5 < 6 && 4 > 3)); // true
        System.out.println("Logical AND: " + (5 < 6 && 4 < 3)); // false
        System.out.println("Logical OR: " + (5 > 6 || 4 > 3));  // true
        System.out.println("Logical OR: " + (5 > 6 || 4 < 3));  // false
        System.out.println("Logical NOT: " + (!(3 < 2)));       // true
    }
}
