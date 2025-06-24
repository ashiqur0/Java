/*
Java OOP : Super Keyword - calling parrent attribure
Super Keyword : is used to refer to the parent class.

It can be used in two main ways:
    1. To access attributes and methods from the parent class
    2. To call the parent class constructor
*/

package Java_W3School._3_Java_OOP._11_super;
class Animal2 {
    String type = "Animal";
}
class Dog2 extends Animal2 {
    String type = "Dog";
    public void printType() {
        System.out.println(super.type);     // Access parent attribute
    }
}
public class _2_call_parent_attribute {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.printType();
    }
}