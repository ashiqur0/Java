/*
Java Errors : Run Time Error

Compile Time Error : Runtime errors occur when the program compiles but crashes or behaves unexpectedly.
    1. Division by Zero
    2. Array Index Out of Bounds
*/

package Java_W3School._4_Java_Error._1_Error;

public class _2_runtime_error {
    public static void main(String[] args) {

        // Runtime Error : Division by Zero
        int x = 5;
        int y = 0;
        int z = x / y;  
        System.out.println(z);

        // Error : Array Index out of bound
        int[] arr = {1, 2, 4};
        System.out.println(arr[8]);
    }
}
