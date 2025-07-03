/*
Hash Map : Access key-value to the LinkedHashMap

LinkedHashMap: stores key-value pair, maintain insertion order
*/

package Java_W3School._6_Java_Data_Structure._13_LinkedHashMap;

import java.util.LinkedHashMap;

public class _3_access {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(41, "Munni");
        students.put(42, "Morium");
        students.put(43, "Tahrina");
        students.put(48, "Tanzid");

        System.out.println(students.get(48));
    }
}
