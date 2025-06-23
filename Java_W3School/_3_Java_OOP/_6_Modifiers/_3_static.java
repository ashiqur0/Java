/*
Java OOP [Modifieres] : static
static: attributes and method belongs to the class rather than an objects.
modifieres and attribute of a class can be assessible without creating instance
*/

package Java_W3School._3_Java_OOP._6_Modifiers;

public class _3_static {
    static int num = 50;
    static double PI = 3.14;

    static void printInfo() {
        System.out.println(num + " " + PI);
    }
    
    public void info() {
        System.out.println(num + " " + PI);
    }

    public static void main(String[] args) {
        printInfo();

        num = 40;
        PI = 3.22;
        System.out.println(num + " " + PI);    // accessible without creating an 

        _3_static obj = new _3_static();
        obj.info();                             // public method need instance to use
    }
}
