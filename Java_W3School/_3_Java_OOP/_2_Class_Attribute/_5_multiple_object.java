/*
OOP [Class Attribute] : Multiple Objects
*/

package Java_W3School._3_Java_OOP._2_Class_Attribute;

public class _5_multiple_object {
    int x = 5;
    public static void main(String[] args) {
        _5_multiple_object obj1 = new  _5_multiple_object();
        _5_multiple_object obj2 = new _5_multiple_object();
        obj1.x = 35;
        System.out.println(obj1.x); // 35 as obj1 is modified
        System.out.println(obj2.x); // 5
    }
}
