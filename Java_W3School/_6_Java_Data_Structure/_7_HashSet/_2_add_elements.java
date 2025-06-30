/*
Set : Add Elements to the HashSet
*/

package Java_W3School._6_Java_Data_Structure._7_HashSet;

import java.util.HashSet;

public class _2_add_elements {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(20);
        nums.add(25);
        nums.add(30);
        nums.add(25);   // duplicate will ignored

        nums.forEach(n -> System.out.print(n + " "));
    }
}
