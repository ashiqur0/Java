/*
Java Methods : Recursion
Recursion : a technique of calling the function itself
*/

package Java_W3School._2_Java_Methods._2_Methods_Parameters;

public class _7_recursion2 {
    public static void main(String[] args) {
        System.out.println("Sum of the number between 5 to 10: " + sum(5, 10));
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return 0;
        }
    }
}
