/*
Java OOP : Abstraction
Abstract classes and methods: Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.
*/

package Java_W3School._3_Java_OOP._13_Abstruction;

abstract class Animal {         // abstract class, cannot create object
    abstract void sound();      // abstract method sound(); without body

    public void sleep() {       // can also have regular method
        System.out.println("Zzz..");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("bow bow...");
    }
}

public class _1_abstruct {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
