/*
DSA : BinarySearch
*/

package Java_Telusko.DSA;

public class _2_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {5, 7, 9, 11, 13};
        int target = 13;

        int result = BinarySearch(arr, target);

        if (result != -1) {
            System.out.println(target + " is found at index " + result);
        } else {
            System.out.println("element is not found");
        }
    }

    public static int BinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
