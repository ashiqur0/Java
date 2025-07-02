/*
Hash Map : Access Items from the TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _3_access_item {
    public static void main(String[] args) {
        TreeMap<String, Integer> people = new TreeMap<>();
        people.put("Joy", 23);
        people.put("Samiul", 24);
        people.put("Nahrul", 21);
        people.put("Tanzid", 22);

        System.out.println(people.get("Joy"));
    }
}
