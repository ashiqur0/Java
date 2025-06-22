
/*
String Reference : endsWith() method
endsWith() : check if String ends with a sequence of character
*/
package Java_Telusko.Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _4_endsWith {
    public static void main(String[] args) {
        String txt = "Hello";
        System.out.println(txt.endsWith("llo"));  // true
        System.out.println(txt.endsWith("o"));    // true
        System.out.println(txt.endsWith("hi"));   // false
    }
}
