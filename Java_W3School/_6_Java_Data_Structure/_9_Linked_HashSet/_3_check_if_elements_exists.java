/*
LinkedHashSet : Check if an elements is exists in LinkedHashSet
*/

package Java_W3School._6_Java_Data_Structure._9_Linked_HashSet;

import java.util.LinkedHashSet;

public class _3_check_if_elements_exists {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums.contains(20));  // ture
        System.out.println(nums.contains(40));  // false
    }
}
