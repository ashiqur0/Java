/*
Java Methods : Method Overloading 
Method Overloading : same method name but different return type or different number of parameters
*/
package Java_W3School._2_Java_Methods._2_Methods_Parameters;

public class _4_method_overloading {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int num3 = 30;
        sum(num1, num2);        // calling sum(int x, int y) method
        sum(num1, num2, num3);  // calling sum(int x, int y, int z) method

        double num4 = 20.88;
        double num5 = 40.12;
        System.out.println(sum(num4, num5)); // calling sum(double x, double y)
    }

    public static void sum(int x, int y) {
        System.out.println(x + y);
    }
    public static void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }
    public static double sum(double x, double y) {
        return x + y;
    }
}
