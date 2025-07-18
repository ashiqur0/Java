/*
DSA : LinearSearch 
*/

package Java_Telusko.DSA.Searching_Algorithm;

public class _1_LinearSearch {
    public static void main(String[] args) {

        int arr[] = {5, 7, 9, 11, 13};
        int target = 9;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println(target + " is found at index " + result);
        } else {
            System.out.println("element is not found");
        }
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
