/*
String Reference : format() method
format() : returns a formated string 
*/

package Java_Telusko.Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _7_format {
    public static void main(String[] args) {
        String greet = "Hello %s, You are %d years old.";
        String fString = String.format(greet, "Ashiqur", 27);
        System.out.println(fString);
    }
}
