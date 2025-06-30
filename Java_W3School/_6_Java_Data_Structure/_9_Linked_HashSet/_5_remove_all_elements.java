/*
LinkedHashSet : Remove all elements from the LinkedHashSet
*/

package Java_W3School._6_Java_Data_Structure._9_Linked_HashSet;

import java.util.LinkedHashSet;

public class _5_remove_all_elements {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums.clear();
        System.out.println(nums);   //[]
    }
}
