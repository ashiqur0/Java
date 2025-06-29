/*
List Sort : Sort ArrayList

*/

package Java_W3School._6_Java_Data_Structure._5_ListSorting;

import java.util.ArrayList;
import java.util.Collections;

public class _1_sort_ArrayList {
    public static void main(String[] args) {

        // ArrayList Sort
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); 
        nums.add(0); 
        nums.add(5); 
        nums.add(2); 
        nums.add(9); 
        nums.add(3); 

        Collections.sort(nums);
        nums.forEach( n -> System.out.print(n + " "));
    }
}
