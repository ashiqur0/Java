/*
OOP [Class Methods] : static vs public method
static keyword : static attribute and method is accessible without creating an object.
public keyword : public attribute and method must need to create an instance to access.
*/


package Java_W3School._3_Java_OOP._3_Class_Methods;

public class _2_static_vs_public {
    static void myMethod() {
        System.out.println("static mehtod...");
    }
    public void myMethod2() {
        System.out.println("public method...");
    }
    public static void main(String[] args) {
        myMethod();
        // myMethod2(); // compiler error due to access public mehtod must need to create an instance ot access.
    }
}
