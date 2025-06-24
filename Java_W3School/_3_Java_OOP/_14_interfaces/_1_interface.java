/*
Java OOP : Interfaces
Interfaces: is a completely abstract class that is used to group related methods with empty bodies
*/

package Java_W3School._3_Java_OOP._14_interfaces;

interface Animal {
    public void sound();
    public void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("bow bow...");
    }
    public void sleep() {
        System.out.println("Zzz...");
    }
}

public class _1_interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
