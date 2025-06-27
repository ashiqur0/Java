/*
Java Debugginh : Print Statements for Debugging

We can use print statements for debugging.
*/

package Java_W3School._4_Java_Error._2_Debugging;

public class _1_print_statements {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        System.out.println("Before Division");      // will execute

        @SuppressWarnings("unused")
        int result = x / y;

        System.out.println("After Division");       // will not, due to chashes
    }
}
