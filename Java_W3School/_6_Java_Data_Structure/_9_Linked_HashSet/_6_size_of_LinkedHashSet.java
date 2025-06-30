/*
LinkedHashSet : Size of the LinkedHashSet
*/

package Java_W3School._6_Java_Data_Structure._9_Linked_HashSet;

import java.util.LinkedHashSet;

public class _6_size_of_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        System.out.println(nums.size());    // 0
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums.size());    // 3
    }
}
