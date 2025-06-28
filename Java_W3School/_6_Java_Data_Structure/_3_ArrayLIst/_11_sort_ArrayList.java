/*
Java Data Structure : Sort ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class _11_sort_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(1);
        nums.add(9);
        nums.add(7);
        nums.add(4);
        nums.add(6);
        nums.add(5);
        nums.add(0);

        Collections.sort(nums);
        System.out.println(nums);   // output: [0, 1, 4, 5, 6, 7, 8, 9]
    }
}
