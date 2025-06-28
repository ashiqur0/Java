/*
Java Data Structure : Loop through the elements of an ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _8_loop_through_ArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Samiul");
        students.add("Nawshin");
        students.add("Simanto");
        students.add("Ruhi");
        students.add("Fahim");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
