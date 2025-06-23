/*
OOP [Class Methods] : Class Methods
static keyword : when use static keyword before a class attribute of class method, it do not need to create an instance of object of the class to access those attribute or methdo in main method.
*/


package Java_W3School._3_Java_OOP._3_Class_Methods;

public class _1_class_methods {

    public static void myMethod() {
        System.out.println("from class method");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
