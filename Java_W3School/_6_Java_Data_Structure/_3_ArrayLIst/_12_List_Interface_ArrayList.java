/*
Java Data Structure : List interface object inititalize by ArrayList 

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;
import java.util.List;

public class _12_List_Interface_ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        
        System.out.println(nums);
    }
}
