/*
Java OOP : Polymorphism
Polymorphism : Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

Why And When To Use "Inheritance" and "Polymorphism"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
*/

package Java_W3School._3_Java_OOP._10_Polymorphism;
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound...");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("bow! bow!...");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow meow...");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("rawr rawr...");
    }
}

public class _1_polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();   // create a Animal object
        Dog dog = new Dog();            // create a Dog object
        Cat cat = new Cat();            // create a Cat object
        Lion lion = new Lion();         // create a Lion object

        animal.sound();
        dog.sound();            // Dog.sound() override Animal.sound()
        cat.sound();            // Cat.sound() override Animal.sound()
        lion.sound();           // Lion.sound() override Animal.sound()
    }
}
