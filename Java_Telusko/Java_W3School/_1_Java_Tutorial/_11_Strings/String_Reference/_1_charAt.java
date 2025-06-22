/*
String Reference : charAt() method
charAt() : return character through index
*/

package Java_Telusko.Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _1_charAt {
    public static void main(String[] args) {
        String greet = "Hello";

        // Access first character
        System.out.println(greet.charAt(0));    // H
        System.out.println(greet.charAt(1));    // e
        
        // Iterate Character
        for(int i = 2; i < greet.length(); i++) {
            System.out.println(greet.charAt(i));
        }

        // StringIndexOutOfBoundsException : if we try to get the character out of range of the string
        System.out.println(greet.charAt(-1));
    }
}
