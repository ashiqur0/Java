/*
Java OOP [Modifieres] : static
final: attributes or method can not be override / modified
*/

package Java_W3School._3_Java_OOP._6_Modifiers;

public class _3_static {
    static int num = 50;
    static double PI = 3.14;

    static void printInfo() {
        System.out.println(num + " " + PI);
    }
    public static void main(String[] args) {
        printInfo();

        num = 40;
        PI = 3.22;
        System.out.println(num + " " + PI);    // accessible without creating an 
    }
}
