/*
Java Data Structure : Change elements of ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _4_change_elements {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        nums.set(0, 1111);
        System.out.println(nums.get(0));    // 1111 insted of 1000
    }
}
