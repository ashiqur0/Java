/*
HashSet : Remove Elements From HashSet
*/


package Java_W3School._6_Java_Data_Structure._7_HashSet;

import java.util.HashSet;

public class _4_remove_elements {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.remove(20);    // 20 is removed from the HashSet

        nums.forEach(n -> System.out.print(n + " "));
    }
}
