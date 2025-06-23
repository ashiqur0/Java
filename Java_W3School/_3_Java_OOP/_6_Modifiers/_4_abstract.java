/*
Java OOP [Modifieres] : abstract
abstract: can only be used in abstract class, and can only be used on methods. The method does not have a body. For example, abstract void run();
*/

package Java_W3School._3_Java_OOP._6_Modifiers;

abstract class  Main {
    public int roll = 20;
    public String name = "Munna";
    abstract void study();
}

class  Student extends Main {
    public int graduation_year = 2027;
    public void study() {
        System.out.println("Study all day long...");
    }    
}


public class _4_abstract {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        System.out.println("Roll: " + student.roll);
        System.out.println("Name: " + student.name);
        System.out.println("Graduation Year: " + student.graduation_year);
    }    
}
