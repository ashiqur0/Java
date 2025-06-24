/*
Java User Input: Different Type of Input

nextByte()      :	Reads a byte value from the user
nextShort()	    :  Reads a short value from the user
nextInt()       :	Reads a int value from the user
nextLong()	    :  Reads a long value from the user

nextFloat()     :	Reads a float value from the user
nextDouble()    :	Reads a double value from the user

nextBoolean()   :	Reads a boolean value from the user
next().charAt(0):	Reads a charactr value from the user

nextLine()      :	Reads a String value from the user

Note: If you enter wrong input (e.g. text in a numerical input), you will get an exception/error message (like "InputMismatchException").
*/

package Java_W3School._3_Java_OOP._16_User_Input;

import java.util.Scanner;

public class _2_different_type_input {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        byte byteNum = scanner.nextByte();   
        short shortNum = scanner.nextShort();
        int intNum = scanner.nextInt();
        long longNum = scanner.nextLong();

        float floatNum = scanner.nextFloat();
        double doubleNum = scanner.nextDouble();

        boolean booleanValue = scanner.nextBoolean();
        char ch = scanner.next().charAt(0);

        String stringValue = scanner.nextLine();
    }
}
