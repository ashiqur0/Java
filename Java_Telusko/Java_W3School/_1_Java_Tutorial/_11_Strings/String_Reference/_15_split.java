/*
String Reference : split() method
split() : Split a string into an array of strings:
*/


package Java_Telusko.Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _15_split {
    public static void main(String[] args) {
        String myStr = "Split a string by spaces, and also puntuation.";
        String regex = "[,\\.\\s]";
        String[] myStrings = myStr.split(regex);
        for (int i = 0; i < myStrings.length; i++) {
            System.out.println(myStrings[i]);
        }
    }
}
