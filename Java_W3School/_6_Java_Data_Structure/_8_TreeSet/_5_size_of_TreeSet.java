/*
TreeSet : Size of TreeSet
*/

package Java_W3School._6_Java_Data_Structure._8_TreeSet;

import java.util.TreeSet;

public class _5_size_of_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        System.out.println(nums.size());        // 0
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums.size());        // 3
    }
}
