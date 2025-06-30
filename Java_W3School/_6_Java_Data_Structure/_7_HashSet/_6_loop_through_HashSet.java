/*
HashSet : Loop Through HashSet
*/

package Java_W3School._6_Java_Data_Structure._7_HashSet;

import java.util.HashSet;

public class _6_loop_through_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for (Integer n : nums) {
            System.out.print(n + " ");
        }
    }
}
