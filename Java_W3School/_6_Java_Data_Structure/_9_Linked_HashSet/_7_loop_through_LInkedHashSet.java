/*
LinkedHashSet : Loop through LinkedHashSet
*/

package Java_W3School._6_Java_Data_Structure._9_Linked_HashSet;

import java.util.LinkedHashSet;

public class _7_loop_through_LInkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for(Integer n : nums) {
            System.out.print(n + " ");
        }
    }
}
