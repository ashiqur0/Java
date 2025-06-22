/*
String Reference : replace() method
replace() : searches a string for a specified character, and returns a new string where the specified character(s) are replaced.
*/

package Java_Telusko.Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _14_replace {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.replace('l', 'p'));
        System.out.println(str);
        System.out.println(str.replace("ll", "pp"));
    }
}
