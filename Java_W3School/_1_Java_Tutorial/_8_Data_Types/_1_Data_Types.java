/*
Java Data Types : Primitive and Non-primitive
Primitive Data Types (Java built-in Data Type): boolean, byte, char, short, int, long, float, double
Non-primitive Data Types (User Define Data Type) : String, arrays, classes, interfaces

// Studied from w3 School
boolean : Stores true or false values
byte : Stores whole numbers from -128 to 127
char : Stores a single character/letter or ASCII values
short : Stores whole numbers from -32,768 to 32,767
int : Stores whole numbers from -2,147,483,648 to 2,147,483,647
long : Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float : Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double : Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
*/

package Java_W3School._1_Java_Tutorial._8_Data_Types;

public class _1_Data_Types {
    public static void main(String[] args) {
        int myNum = 98;             // Integer (whole number)
        float myFloatNum = 5.99f;   // Floatint Point Number
        char myLetter = 'D';        // Character
        boolean myBool = true;      // Boolean
        String myString = "Hello";  // String 

        System.out.println(myNum + " " + myFloatNum + " " + myLetter + " " + myBool + " " + myString);
    }
}
