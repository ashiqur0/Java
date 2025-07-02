/*
Hash Map : Size of a HashMap

HashMap: stores key-value pair, where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;

public class _6_size_of_a_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        System.out.println(students.size());        // 0
        students.put(55, "Chanchal");
        students.put(57, "Roktim");
        students.put(60, "Biddut");
        students.put(65, "Dipto");

        System.out.println(students.size());        // 4
    }
}
