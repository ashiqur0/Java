/*
HashSet : HashSet size
*/

package Java_W3School._6_Java_Data_Structure._7_HashSet;

import java.util.HashSet;

public class _5_HashSet_size {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();

        System.out.println(nums.size());    // 0
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums.size());    // 3
    }
}
