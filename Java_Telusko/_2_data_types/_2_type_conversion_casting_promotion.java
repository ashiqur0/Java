/*
Java : Type Conversion 
Type Conversion:automatically casting smaller data type to bigger data type
Type Casting:   inplicitly convert bigger data type to smaller data dype
Type Promotion: smaller data type to bigger data type

*/

package Java_Telusko._2_data_types;

public class _2_type_conversion_casting_promotion {
    public static void main(String[] args) {
        // Type Conversion
        byte a = 5;
        int x = a;
        System.out.println(x);

        // Type Castign 
        int y = 10;
        byte b = (byte) y;
        System.out.println(b);

        // Type Promotion
        byte m = 10;
        byte n = 30;
        int c = m * n; // as the value of m*n is out of rang of byte data type but in range int
        System.out.println(c);
    }
}
