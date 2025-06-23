/*
Java OOP : Create Multiple Classes
*/

package Java_W3School._3_Java_OOP._1_Class_Object;
class A {
    int x = 5;
}

class B {
    int x = 50;
}

public class _3_multiple_classes {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.x);    // 5
        System.out.println(b.x);    // 50
    }    
}
