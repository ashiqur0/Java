/*
Java OOP : this keyword
this keyword : in java referes to the current objects in a method or constructor.
this keyword is often used to avoid confusion when class attribute have the same name as method or constructor name.
*/

package Java_W3School._3_Java_OOP._5_this_keyword;

public class _1_this_keyword {
    int roll;
    String name;
    
    public _1_this_keyword(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        _1_this_keyword student = new _1_this_keyword(5, "Fahim");
        System.out.println("Student Roll: " + student.roll);
        System.out.println("Student Name: " + student.name);
    }
}
