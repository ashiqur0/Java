/*
Hash Map : Loop through HashMap Keys

HashMap: stores key-value pair, where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;

public class _7_access_keys {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(41, "Munni");
        students.put(43, "Moriyom");
        students.put(44, "Tahrina");
        students.put(49, "Medha");

        for (Integer n : students.keySet()) {
            System.out.print(n + " ");
        }
    }
}
