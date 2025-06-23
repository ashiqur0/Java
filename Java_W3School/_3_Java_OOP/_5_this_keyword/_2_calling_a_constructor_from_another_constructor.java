/*
Java OOP : this keyword, calling a constructor from another constructor
*/

package Java_W3School._3_Java_OOP._5_this_keyword;

public class _2_calling_a_constructor_from_another_constructor {
    int batch;
    String name;
    public _2_calling_a_constructor_from_another_constructor(String name) {
        this(23, name); // refering the current class constructor with 2 parameter value
    }
    public _2_calling_a_constructor_from_another_constructor(int roll, String name) {
        this.batch = roll;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Batch: " + batch);
    }

    public static void main(String[] args) {
        _2_calling_a_constructor_from_another_constructor student1  = new _2_calling_a_constructor_from_another_constructor("Biddut Roy");
        _2_calling_a_constructor_from_another_constructor student2  = new _2_calling_a_constructor_from_another_constructor("Chancal Kumar");
        _2_calling_a_constructor_from_another_constructor student3  = new _2_calling_a_constructor_from_another_constructor("Pollob Kumar");
        _2_calling_a_constructor_from_another_constructor student4  = new _2_calling_a_constructor_from_another_constructor("Simanto Sarkar");
        _2_calling_a_constructor_from_another_constructor student5  = new _2_calling_a_constructor_from_another_constructor("Roktim Roy");
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
        student5.printInfo();
    }
}
