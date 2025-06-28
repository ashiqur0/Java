/*
Java Data Structure : Size ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _7_size_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.println(marks.size());    // output: 0

        marks.add(10);
        marks.add(20);

        System.out.println(marks.size());   // output: 2
    }
}
