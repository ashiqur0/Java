/*
String Reference : lastIndexOf() method
lastIndexOf() : search a string for last occurence of a character of a sequence of character
*/
package Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _12_lastIndexOf {
    public static void main(String[] args) {
        String str = "Hello, Java Programmar";
        System.out.println(str.lastIndexOf('a'));           // 20
        System.out.println(str.lastIndexOf("Programmar")); // 12
    }
}
