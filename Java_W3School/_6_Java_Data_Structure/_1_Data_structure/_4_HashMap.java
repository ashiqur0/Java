/*
Java Data Structure : HashMap
stores key-value pair
*/


package Java_W3School._6_Java_Data_Structure._1_Data_structure;

import java.util.HashMap;

public class _4_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Samiul");
        students.put(2, "Nawshin");
        students.put(3, "Simanto");
        students.put(4, "Ruhi");

        System.out.println("Roll\tName");
        for (Integer key : students.keySet()) {
            System.out.println("  " + key + "\t" + students.get(key));
        }
    }
}
