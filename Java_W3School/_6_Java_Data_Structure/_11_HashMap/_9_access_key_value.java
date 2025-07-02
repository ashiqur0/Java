/*
Hash Map : Access Kye-Value pairs of a HashMap

HashMap: stores key-value pair, where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;

public class _9_access_key_value {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(35, "Tasbiha");
        students.put(37, "Rayan");
        students.put(56, "Soma");
        students.put(54, "Sadia");

        for (Integer key : students.keySet()) {
            System.out.println(key + " " + students.get(key));
        }
    }
}
