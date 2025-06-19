/*
Java String : String Basics
*/


package Java_W3School._1_Java_Tutorial._11_Strings;

public class _1_String {
    public static void main(String[] args) {

        // String 
        String greeting = "Hello";

        // String Length
        int strLength = greeting.length();
        System.out.println("String Length: " + strLength);  // 5

        // Uppercase
        greeting.toUpperCase(); // HELLO

        // Lowercase
        greeting.toLowerCase(); // hello

        // Finding a character in a string 
        String txt = "Hello Java Programmar";
        System.out.println(txt.indexOf("Java"));    // 6
    }
}
