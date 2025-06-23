/*
Java OOP : Constructors
Constructors : 
is a soecial method used to initialized object
constructor is called when object is created.
It can be used tu set initial values for the class attribute
*/


package Java_W3School._3_Java_OOP._4_Constructors;

public class _1_constructors {

    int x;                      // create a class attribute
    public _1_constructors() { 
        x = 5;                  // initialized value with the constructor
    }
    
    public static void main(String[] args) {
        _1_constructors obj = new _1_constructors();
        System.out.println(obj.x);
    }
}
