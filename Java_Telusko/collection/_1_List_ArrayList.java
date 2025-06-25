package Java_Telusko.collection;

import java.util.ArrayList;
import java.util.List;

public class _1_List_ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(); 
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        
        System.out.println(nums);

        for(int n : nums) {
            System.out.println(n);
        }
    }
}
