/*
Hash Map : Loop through all the values of the TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _8_access_values {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(8, "Murad");
        students.put(9, "Ashiqur");
        students.put(14, "Alim");
        students.put(16, "Rabbi");
        students.put(20, "Munna");

        for (String val : students.values()) {
            System.out.println(val);
        }
    }
}
