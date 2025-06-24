/*
Java OOP : Encapsulation
Encapsulation: The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.

To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
*/

package Java_W3School._3_Java_OOP._7_encapsulation;

class Student {
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
        Student student = new Student();
        
        student.setRoll(5);
        student.setName("Fahim");

        System.out.println("Roll: " + student.getRoll());
        System.out.println("Name: " + student.getName());
    }
}
