/*
Java Methods : Method with if statement
*/

package Java_W3School._2_Java_Methods._2_Methods_Parameters;

public class _2_method_with_if {
    public static void main(String[] args) {
        int number = 4;
        isOdd(number);
    }

    public static void isOdd(int n) {
        if(n % 2 != 0) {
            System.out.println(n + " is a odd number");
        } else {
            System.out.println(n + " is not an odd number");
        }
    }
}
