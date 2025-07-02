/*
Hash Map : Clear TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _5_clear_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(48, "Tanzid");
        students.put(55, "Chanchal");
        students.put(57, "Roktim");
        students.put(60, "Biddut");

        students.clear();   // all key-value pair is removed
        System.out.println(students);
    }
}
