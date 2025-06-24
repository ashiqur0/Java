/*
Java OOP : Multiple Interfaces

*/

package Java_W3School._3_Java_OOP._14_interfaces;

interface Cow {
    void drink();
}

interface Goat {
    void eat();
}

class DomesticAnimal implements Cow, Goat {
    public void drink() {
        System.out.println("drinking...");
    }

    public void eat() {
        System.out.println("eating...");
    }
}

public class _2_multiple_interface {
    public static void main(String[] args) {
        DomesticAnimal domesticAnimal = new DomesticAnimal();
        domesticAnimal.drink();
        domesticAnimal.eat();
    }
}
