/*
List Sort : Sort ArrayList in Descending Order

*/

package Java_W3School._6_Java_Data_Structure._5_ListSorting;

import java.util.ArrayList;
import java.util.Collections;

public class _3_reverse_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(0);
        nums.add(4);

        Collections.sort(nums, Collections.reverseOrder());
        nums.forEach(n -> System.out.print(n + " "));
    }
}
