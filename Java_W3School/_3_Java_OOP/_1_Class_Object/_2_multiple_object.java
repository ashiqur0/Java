/*
Java OOP : Create Multiple Object
*/

package Java_W3School._3_Java_OOP._1_Class_Object;

public class _2_multiple_object {
    int x = 5;
    public static void main(String[] args) {
        _2_multiple_object obj1 = new _2_multiple_object();
        _2_multiple_object obj2 = new _2_multiple_object();
        obj2.x = 4;
        System.out.println(obj1.x); // 5
        System.out.println(obj2.x); // 4; because obj1 and obj2 are distinct
    }
}
