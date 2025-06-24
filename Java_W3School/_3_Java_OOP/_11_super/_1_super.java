/*
Java OOP : Super Keyword
Super Keyword : is used to refer to the parent class.

It can be used in two main ways:
    1. To access attributes and methods from the parent class
    2. To call the parent class constructor
*/
package Java_W3School._3_Java_OOP._11_super;
class Animal {
    public void sound() {
        System.out.println("Animal Sound...");
    }
}

class Dog extends Animal {
    public void sound() {
        super.sound();                      // call the parent method
        System.out.println("bow bow..."); // 
    }
}

public class _1_super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
// Note: Use super when you want to call a method from the parent class that has been overridden in the child class.