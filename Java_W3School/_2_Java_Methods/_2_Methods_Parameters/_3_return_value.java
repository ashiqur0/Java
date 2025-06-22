
/*
Java Methods : return value method
*/
package Java_W3School._2_Java_Methods._2_Methods_Parameters;

public class _3_return_value {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(sum(num1, num2));    // 30
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
