/*
Hash Map : Access Values of a HashMap

HashMap: stores key-value pair, where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;

public class _8_access_values {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(53, "Sharna");
        students.put(58, "Anika");
        students.put(67, "Raisa");
        students.put(68, "Fahmida");

        for (String val : students.values()) {
            System.out.println(val);
        }
    }
}
