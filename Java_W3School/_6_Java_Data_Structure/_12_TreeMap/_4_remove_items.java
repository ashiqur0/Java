/*
Hash Map : Removes Item from TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _4_remove_items {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(9, "Ashiqur");
        students.put(14, "Alim");
        students.put(16, "Rabbi");
        students.put(20, "Munna");

        students.remove(9); // the value against the key 9 is removed

        System.out.println(students);
    }
}
