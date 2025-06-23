/*
Java OOP : Class Attribute
*/

package Java_W3School._3_Java_OOP._2_Class_Attribute;

public class _1_class_attribute {
    int roll = 5;
    String name = "Fahim";
    public static void main(String[] args) {
        _1_class_attribute obj = new _1_class_attribute();
        System.out.println("Student Name: " + obj.name);
        System.out.println("Student Roll: " + obj.roll);
    }
}
