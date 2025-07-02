/*
Hash Map : Get Data from HashMap

HashMap: stores key-value pair, where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;

public class _3_get_data {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Samiul");
        students.put(2, "Nawshin");
        students.put(3, "Simanto");
        students.put(4, "Ruhi");

        System.out.println(students.get(1));
    }
}
