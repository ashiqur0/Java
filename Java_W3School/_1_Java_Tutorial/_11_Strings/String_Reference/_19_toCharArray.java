/*
String Reference : toCharArray() method
toCharArray() : convert a String to a Char array
*/

package Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _19_toCharArray {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
    }
}
