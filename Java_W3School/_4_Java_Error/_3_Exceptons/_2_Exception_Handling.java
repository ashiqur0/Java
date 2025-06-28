/*
Java Exceptions : ArrayIndexOutOfBound Exception
*/

package Java_W3School._4_Java_Error._3_Exceptons;

public class _2_Exception_Handling {
    public static void main(String[] args) {

        // Handle ArrayIndexOutOfBound Exception
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("something went wrong...");
        }
    }
}
