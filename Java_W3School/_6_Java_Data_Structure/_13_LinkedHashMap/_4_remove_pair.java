/*
Hash Map : Access key-value to the LinkedHashMap

LinkedHashMap: stores key-value pair, maintain insertion order
*/

package Java_W3School._6_Java_Data_Structure._13_LinkedHashMap;

import java.util.LinkedHashMap;

public class _4_remove_pair {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(14, "Alim");
        students.put(16, "Rabbi");
        students.put(20, "Munna");

        students.remove(14);        // remove key-value pair by key
        System.out.println(students);
    }
}
