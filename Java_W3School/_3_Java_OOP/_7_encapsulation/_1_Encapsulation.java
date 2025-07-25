/*
Java OOP : Encapsulation
Encapsulation: The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.

To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
*/

package Java_W3School._3_Java_OOP._7_encapsulation;

class Student1 {
    private int roll;
    private String name;
    
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class _1_Encapsulation {
    public static void main(String[] args) {
        Student1 student = new Student1();
        
        student.setRoll(5);
        student.setName("Fahim");

        System.out.println("Roll: " + student.getRoll());
        System.out.println("Name: " + student.getName());
    }
}
