/*
Java OOP : Super Keyword - calling parrent constructor
Super Keyword : is used to refer to the parent class.

It can be used in two main ways:
    1. To access attributes and methods from the parent class
    2. To call the parent class constructor
*/

package Java_W3School._3_Java_OOP._11_super;

class Animal3 {
    Animal3() {
        System.out.println("Animal is created...");
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        super();                                    // accessing parent constructor
        System.out.println("Dog is created...");
    }
}

public class _3_call_parent_constructor {
    public static void main(String[] args) {
        Dog3 dog3 = new Dog3();
    }
}
