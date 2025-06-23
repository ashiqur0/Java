/*
Java OOP : Parametarised Constructors
Parametarised Constructors : used to initialized class attribute, collect the value from object creation
*/

package Java_W3School._3_Java_OOP._4_Constructors;

public class _2_constructor_parameter {
    int x;                                      // create class attribute
    public _2_constructor_parameter(int num) {
        x = num;                                // initialized with parametarised constructor
    }

    public static void main(String[] args) {
        _2_constructor_parameter obj = new _2_constructor_parameter(5); // pass a vlue trough the constructor
        System.out.println(obj.x);
    }
}
