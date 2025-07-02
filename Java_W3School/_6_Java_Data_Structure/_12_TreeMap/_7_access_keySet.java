/*
Hash Map : Loop through all the key of the TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _7_access_keySet {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(3, "Ritchi");
        students.put(15, "Xobayer");
        students.put(20, "Munna");
        students.put(21, "Sabid");

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }
    }
}
