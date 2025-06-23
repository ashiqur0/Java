/*
Java OOP : this keyword, calling a constructor from another constructor
*/

package Java_W3School._3_Java_OOP._5_this_keyword;

public class _2_calling_a_constructor_from_another_constructor {
    int roll;
    String name;
    public _2_calling_a_constructor_from_another_constructor(String name) {
        this(60, name); // refering the current class constructor with 2 parameter value
    }
    public _2_calling_a_constructor_from_another_constructor(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        _2_calling_a_constructor_from_another_constructor student  = new _2_calling_a_constructor_from_another_constructor("Biddut Roy");
        System.out.println("Student Roll: " + student.roll);
        System.out.println("Student Name: " + student.name);
    }
}
