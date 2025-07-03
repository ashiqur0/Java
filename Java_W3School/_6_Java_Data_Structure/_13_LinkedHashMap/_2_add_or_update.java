/*
Hash Map : Add or update key-value to the LinkedHashMap

LinkedHashMap: stores key-value pair, maintain insertion order
*/

package Java_W3School._6_Java_Data_Structure._13_LinkedHashMap;

import java.util.LinkedHashMap;

public class _2_add_or_update {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(30, "Joy");
        students.put(32, "Samiul");
        students.put(35, "Nahrul");
        students.put(36, "Tasbiha");
    }
}
