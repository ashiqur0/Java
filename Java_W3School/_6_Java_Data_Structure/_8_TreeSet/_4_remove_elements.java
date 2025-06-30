/*
TreeSet : Remove Elements From TreeSet
*/

package Java_W3School._6_Java_Data_Structure._8_TreeSet;

import java.util.TreeSet;

public class _4_remove_elements {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.remove(10);
        nums.forEach(n -> System.out.print(n + " "));
    }
}
