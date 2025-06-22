/*
String Reference : getBytes() method
getBytes() : convert a string to byte array
*/

package Java_W3School._1_Java_Tutorial._11_Strings.String_Reference;

public class _8_getBytes {
    public static void main(String[] args) {
        String str = "hello";
        byte[] arr = str.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
