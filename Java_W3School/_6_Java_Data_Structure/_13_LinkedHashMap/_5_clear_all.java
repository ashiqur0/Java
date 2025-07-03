/*
Hash Map : remove all key-value to the LinkedHashMap

LinkedHashMap: stores key-value pair, maintain insertion order
*/

package Java_W3School._6_Java_Data_Structure._13_LinkedHashMap;

import java.util.LinkedHashMap;

public class _5_clear_all {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
        marks.put("Tanzid", 89);
        marks.put("Raisa", 88);
        marks.put("Arif", 93);
        System.out.println(marks);

        marks.clear();              // remove all pairs
        System.out.println(marks);
    }
}
