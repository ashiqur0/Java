/*
Hash Map : Size of the TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _6_size_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        System.out.println(students.size());    // 0
        students.put(5, "Fahim");
        students.put(8, "Murad");
        students.put(3, "Richi");
        students.put(15, "Xobayer");

        System.out.println(students.size());    // 4
    }
}
