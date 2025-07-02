/*
Hash Map : Access key-value pair of the TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _9_access_key_value_pair {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(21, "Sabid");
        students.put(23, "Pollob");
        students.put(29, "Arif");
        students.put(30, "Joy");
        students.put(32, "Samiul");

        for (Integer key : students.keySet()) {
            System.out.println(key + " " + students.get(key));
        }
    }
}
