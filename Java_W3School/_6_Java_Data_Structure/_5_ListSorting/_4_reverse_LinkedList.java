/*
List Sort : Sort LinkedList in Descending Order

*/

package Java_W3School._6_Java_Data_Structure._5_ListSorting;

import java.util.LinkedList;
import java.util.Collections;

public class _4_reverse_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.addFirst(3);
        nums.addFirst(2);
        nums.addFirst(1);
        nums.addFirst(9);
        nums.addLast(6);
        nums.addLast(8);
        nums.addLast(7);
        nums.addLast(5);

        Collections.sort(nums, Collections.reverseOrder());
        nums.forEach(n -> System.out.print(n + " "));
    }
}
