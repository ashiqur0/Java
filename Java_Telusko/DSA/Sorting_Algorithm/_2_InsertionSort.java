/*
DSA : Insertion Sort
*/

package Java_Telusko.DSA.Sorting_Algorithm;

public class _2_InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 0, 9, 7, 8, 5, 3, 6};
        for (int i = 1; i < arr.length; i++) {
            int insertIndex = i;
            int currentValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                insertIndex = j;
                j--; 
            }
            arr[insertIndex] = currentValue;
        }
        
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
