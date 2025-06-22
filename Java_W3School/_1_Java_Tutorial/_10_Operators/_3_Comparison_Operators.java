/*
Java Operators : Comparison Operators
    Arithmetic Operators:
    Assignment Operators:
    Comparison Operators: 
        Equal: ==
        Not equal: !=
        Less than: <
        Greater than: >
        Greater than equal: >=
        Less than equal: <=

    Logical Operators: 
    Bitwise Operators: 
*/

package Java_W3School._1_Java_Tutorial._10_Operators;

public class _3_Comparison_Operators {
    public static void main(String[] args) {

        // Comparison Operators: verify boolean balue
        int x = 10, y = 5;
        System.out.println("Equal: " + (x == y));               // false
        System.out.println("Not equal: " + (x != y));           // true
        System.out.println("Less than: " + (x < y));            // false
        System.out.println("Greater than: " + (x > y));         // true
        System.out.println("Greater than equal: " + (x >= y));  // true
        System.out.println("Less than equal: " + (x <= y));     // false
    }
}
