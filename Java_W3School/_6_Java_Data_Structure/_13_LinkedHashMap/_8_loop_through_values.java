/*
Hash Map : Loop through values of the LinkedHashMap

LinkedHashMap: stores key-value pair, maintain insertion order
*/

package Java_W3School._6_Java_Data_Structure._13_LinkedHashMap;

import java.util.LinkedHashMap;

public class _8_loop_through_values {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
            students.put(1, "Samiul");
            students.put(2, "Nawshin");
            students.put(3, "Simanto");
            students.put(4, "Ruhi");
    
        for(String val : students.values()) {
            System.out.println(val);
        }
    }
}
