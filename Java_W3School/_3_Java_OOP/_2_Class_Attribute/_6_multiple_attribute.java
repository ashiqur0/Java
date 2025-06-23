/*
OOP [Class Attribute] : Multiple Attribute
*/

package Java_W3School._3_Java_OOP._2_Class_Attribute;

public class _6_multiple_attribute {
    String name = "Joy";
    int roll = 30;
    double grade =  3.88;
    public static void main(String[] args) {
        _6_multiple_attribute obj = new _6_multiple_attribute();
        System.out.println("Student Roll: " + obj.roll);
        System.out.println("Student Name: " + obj.name);
        System.out.println("Student Grade: " + obj.grade);
    }
}
