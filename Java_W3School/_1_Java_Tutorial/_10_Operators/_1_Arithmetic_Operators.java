/*
Java Operators : Arithmetic Operators
    Arithmetic Operators: + - * / %
        Addition: a + b
        Subraction: a - b
        Multiplication: a*b
        Division: a / b
        Modulo: a % b
        Unary Operators: ++ --
            Pre incement: ++i    or i = i + 1 or i += 1;  (first add then use)
            Pre decrement: --i   or i = i - 1 or i -= 1;  (first add then use)
            Post increment: i++  or i = i + 1 or i += 1;  (first use then add)
            Post decrement: i--  or i = i - 1 or i -= 1;  (first use then add)

    Assignment Operators: 
    Comparison Operators: 
    Logical Operators: 
    Bitwise Operators: 
*/

package Java_W3School._1_Java_Tutorial._10_Operators;

public class _1_Arithmetic_Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int x = 10, y = 5;
        System.out.println("Addition: " + (x + y));       // 15
        System.out.println("Subtraction: " + (x - y));    // 5
        System.out.println("Multiplication: " + (x * y)); // 50
        System.out.println("Division: " + (x / y));       // 2
        System.out.println("Modulo: " + (x % y));         // 0
        
        // Unary Operators
        System.out.println("Pree Increment: " + ++x); // 11
        System.out.println("Pree Decrement: " + --x); // 10
        System.out.println("Post Increment: " + x++); // 10 (internally 11)
        System.out.println("Post Decrement: " + x--); // 10 (internally 10)
    }
}
