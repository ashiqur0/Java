/*
Hash Map : Remove all elements from HashMap

HashMap: stores key-value pair, where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;

public class _5_remove_all_elements {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(32, "Samiul");
        students.put(36, "Nahrul");
        students.put(39, "Anonto");
        students.put(48, "Tazid");

        students.clear();
        System.out.println(students);
    }
}
