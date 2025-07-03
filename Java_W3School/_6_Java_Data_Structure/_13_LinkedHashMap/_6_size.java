/*
Hash Map : Size of the LinkedHashMap

LinkedHashMap: stores key-value pair, maintain insertion order
*/

package Java_W3School._6_Java_Data_Structure._13_LinkedHashMap;

import java.util.LinkedHashMap;

public class _6_size {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();

        System.out.println(marks.size());   // 0
        marks.put("Tanzid", 89);
        marks.put("Murad", 88);
        marks.put("Alim", 82);

        System.out.println(marks.size());   // 3
    }
}
