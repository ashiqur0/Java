/*
Java Array : 1D, Multi Dimentional, and Jagged Array
1D Array : Ex. [1, 2, 3]
2D Array : Ex. [
                [1, 2, 3]
                [1, 2, 3]
                [1, 2, 3]
                         ]
Jagged Array : Ex. [
                [1, 2, 3]
                [1, 2, 3, 4]
                [1, 2]
                         ] 
*/

package Java_Telusko._7_array;


public class _1_array {
    public static void main(String[] args) {

        // 1 Dimentional Array
        System.out.println("1 Dimentional Array:");
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // Multi Dimentional Array
        System.out.println("Multi Dimentional Array:");
        int[][] arr2 = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] = (int)(Math.random() * 10);
            }
        }
        
        for (int[] a : arr2) {
            for (int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        
        // Jagged Array
        System.out.println("\nJagged Array");
        int arr3[][] = new int[3][];
        arr3[0] = new int[3];
        arr3[1] = new int[4];
        arr3[2] = new int[2];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = (int)(Math.random() * 10);
            }
        }
        
        for (int[] a : arr3) {
            for (int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
