/*
Java Array : Multi dimentional array
1 2 3 4
5 4 8 3
7 8 9 0
*/

package Java_W3School._1_Java_Tutorial._19_Arrays;

public class _4_multi_dimentional_array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 4, 8, 3}, {7, 8, 9, 0}};

        // using for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // using enhanced for loop (for each loop)
        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
