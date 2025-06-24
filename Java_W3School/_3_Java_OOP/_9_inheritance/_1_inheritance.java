/*
Java OOP : Inheritance [sub-class, super-class]

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
*/

package Java_W3School._3_Java_OOP._9_inheritance;

class Human {
    protected String name = "Fahim";                 // Human class attribute
    public void run() {                              // Human class method
        System.out.println("running...");
    }
}

public class _1_inheritance extends Human {
    private int speed = 20;                          // Main class attribute
    public static void main(String[] args) {
        _1_inheritance obj = new _1_inheritance();   // crating Main class object
        obj.run();                                   // calling Human class method
        System.out.println("Name: " + obj.name + ", Speed: " + obj.speed + " km/h");
        // accessing parent and child class attribute using current class object, as current class is inherit to the Human (parent class)
    }
}
