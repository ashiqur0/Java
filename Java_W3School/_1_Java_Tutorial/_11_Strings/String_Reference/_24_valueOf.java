/*
String Reference : valueOf() method
valueOf() : returns a string representation of diffrent data type
অর্থাৎ যেকোনো ডাটা টাইপকে স্ট্রিং ডাটা টাইপে রুপান্তর করে।
*/

package Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _24_valueOf {
    public static void main(String[] args) {
        char[] myArr = {'a', 'b', 'c'};
        System.out.println(String.valueOf(myArr));
        System.out.println(String.valueOf('A'));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(3.5f));
        System.out.println(String.valueOf(3.2));
        System.out.println(String.valueOf(12));
        System.out.println(String.valueOf(1400L));
    }
}
