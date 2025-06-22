/*
Java Operators : Assignment Operators
    Arithmetic Operators:
    Assignment Operators: 
        Assignment: =
        Additional Assignment: += (same as: a = a + num)
        Subtractional Assignment: -=
        Multiplicative Assignment: *=
        Division Assignment: /=
        Modulo Assignment: %=

        Bitwise AND Assignment: &=
        Bitwise OR Assignment: |=
        Bitwise XOR Assignment: ^=
        Bitwise Right Shift Assignment: >>=
        Bitwise Left Shift Assignment: <<=

    Comparison Operators: 
    Logical Operators: 
    Bitwise Operators: 
*/

package Java_W3School._1_Java_Tutorial._10_Operators;

public class _2_Assignment_Operators {
    public static void main(String[] args) {

        // Assignment Operator
        int x = 5, y = 3;
        System.out.println("Additional Assignment: " + (x += y));           // 8
        System.out.println("Subtractional Assignment: " + (x -= y));        // 5
        System.out.println("Multiplicative Assignment: " + (x *= y));       // 15
        System.out.println("Division Assignment: " + (x /= y));             // 5
        System.out.println("Modulo Assignment: " + (x %= y));               // 2
        
        System.out.println("Bitwise AND Assignment: " + (x &= y));          // 2
        System.out.println("Bitwise OR Assignment: " + (x |= y));           // 3
        System.out.println("Bitwise XOR Assignment: " + (x ^= y));          // 0
        System.out.println("Bitwise Right Shift Assignment: " + (y >>= 1)); // 1
        System.out.println("Bitwise Left Shift Assignment: " + (y <<= 3));  // 8
    }
}
