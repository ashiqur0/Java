/*
TreeSet : Check If An Elements Is Exists In TreeSet
*/

package Java_W3School._6_Java_Data_Structure._8_TreeSet;

import java.util.TreeSet;

public class _3_if_element_exists {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println(nums.contains(10));  // true
    }
}
