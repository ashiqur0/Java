/*
Java : Data Types
byte byteNum    : 1 byte
short shortNum  : 2 byte
int intNum      : 4 byte
long longNum    : 8 byte

float floatNum  : 4 byte
double doubleNum: 8 byte

char charNum    : 2 byte
boolean bool    : 1 byte

literal         : integer literal, character literal, string literal etc
*/

package Java_Telusko._2_data_types;

public class _1_data_types {
    public static void main(String[] args) {

        // data_type variable_name = literal (integer literal, character literal etc)
        byte byteNum = 127;
        short shortNum = 32665;
        int intNum = 1013475938;
        long longNum = 1234567891010121314l;
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);

        float floatNum = 3.14f;
        double doubleNum = 3.14;
        System.out.println(floatNum);
        System.out.println(doubleNum);

        char charNum = 65;
        boolean bool = true;
        System.out.println(charNum);
        System.out.println(bool);        
    }
}
