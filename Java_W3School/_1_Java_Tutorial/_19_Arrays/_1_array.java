/*
Java Array : Array
Array : Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
*/
package Java_W3School._1_Java_Tutorial._19_Arrays;

public class _1_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
