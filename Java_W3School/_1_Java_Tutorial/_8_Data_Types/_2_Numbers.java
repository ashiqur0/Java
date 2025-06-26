/*
Java Numbers : Integer Type and Floating Poin Type
Primitive number types are divided into two groups : Integer types and Floating point types 
Integer types : byte, short, int, long
Floating point types : float, double
*/

package Java_W3School._1_Java_Tutorial._8_Data_Types;

public class _2_Numbers {
    public static void main(String[] args) {
        // Integer Type : 
        // byte : Stores whole numbers from -128 to 127
        byte myByteNum = 100;
        System.out.println(myByteNum);

        // short : Stores whole numbers from -32,768 to 32,767
        short myShortNum = 5000;
        System.out.println(myShortNum);

        // int : Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int myIntNum = 1000000000;
        System.out.println(myIntNum);

        // long : Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLongNum = 1000000000000000l; // added 'l' to specify long value
        System.out.println("Long value: " + myLongNum);

        // Floating point types : 
        // float : Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float myFloatNum = 2.99f;           // added 'f' to specify float value
        System.out.println(myFloatNum);

        // double : Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        double myDoubleNum = 3.141590000001;
        System.out.println(myDoubleNum);

        // Scientific Number : 
        float myF_ScNum = 35e3f;
        double myScNum = 12e4d;
        System.out.println(myF_ScNum);
        System.out.println(myScNum);
    }
}
