/*
DSA : BinarySearch Recursive
*/

package Java_Telusko.DSA.Searching_Algorithm;

public class _3_BinarySearch_recursive {
    public static void main(String[] args) {

        int arr[] = {5, 7, 9, 11, 13};
        int target = 13;

        int result = BinarySearch(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println(target + " is found at index " + result);
        } else {
            System.out.println("element is not found");
        }
    }

    public static int BinarySearch(int arr[], int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) return BinarySearch(arr, target, mid + 1, end);
            else return BinarySearch(arr, target, start, mid - 1);
        }

        return -1;
    }
}
