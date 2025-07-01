/*
DSA : Search Items in Array 
*/

package Java_Telusko.DSA.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 3;
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isFound = true;
                break;
            }
        }

        System.out.println((isFound ? "Found" : "not found"));
    }
}
