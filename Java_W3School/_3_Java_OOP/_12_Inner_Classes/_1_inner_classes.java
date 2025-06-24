/*
Java OOP : Inner Classes
Inner Classes : nested class (class inside of a class). To access inner class make an object of outer class then create an object of inner class.
*/

package Java_W3School._3_Java_OOP._12_Inner_Classes;

class OuterClass {
    int x = 5;
    class InnerClass {
        int y = 10;
    }
}

public class _1_inner_classes {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();                    // outer class object
        OuterClass.InnerClass inner = outer.new InnerClass();   // inner class object
        System.out.println("Outer class attribute: " + outer.x);
        System.out.println("Inner class attribute: " + inner.y);
    }
}
