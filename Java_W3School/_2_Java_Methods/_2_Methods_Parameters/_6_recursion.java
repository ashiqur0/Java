/*
Java Methods : Recursion
Recursion : a technique of calling the function itself
*/

package Java_W3School._2_Java_Methods._2_Methods_Parameters;

public class _6_recursion {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 numbers: " + sum(10));
    }

    public static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
}
