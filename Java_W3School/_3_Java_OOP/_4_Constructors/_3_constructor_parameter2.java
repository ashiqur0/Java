/*
Java OOP : Multiple Parametarised Constructors
Parametarised Constructors : used to initialized class attribute, collect the value from object creation
*/

package Java_W3School._3_Java_OOP._4_Constructors;

public class _3_constructor_parameter2 {
    int roll; 
    String name;

    public _3_constructor_parameter2(int r, String n) {
        roll = r;
        name = n;
    }

    public static void main(String[] args) {
        _3_constructor_parameter2 obj = new _3_constructor_parameter2(3, "Simato");
        System.out.println("Student Roll: " + obj.roll);
        System.out.println("Student Name: " + obj.name);
    }
}
