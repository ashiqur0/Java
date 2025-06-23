/*
OOP [Class Attribute] : Unmodifyable Attribute [final keyword]
*/

package Java_W3School._3_Java_OOP._2_Class_Attribute;

public class _4_unmodifyable_attribute {
    final int x = 5;
    public static void main(String[] args) {
        _4_unmodifyable_attribute obj = new _4_unmodifyable_attribute();
        // obj.x = 45; // error : final variable can not be changed as it it a constant
        System.out.println(obj.x);
    }
}
