/*
String Reference : equalsIgnoreCase() method
equalsIgnoreCase() : check if String is equals to another string ignoring case of the letter
*/

package Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _6_equalsIgnoreCase {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.equalsIgnoreCase("hello"));  // true
        System.out.println(str.equalsIgnoreCase("Hello"));  // true
    }
}
