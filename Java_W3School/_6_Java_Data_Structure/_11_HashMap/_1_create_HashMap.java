/*
Hash Map : Create HashMap

HashMap: stores key-value pair, do not maintain order. where each key map to specific values
It can stores different types of combinations. Such as, String- Integer, String-String etc.
*/

package Java_W3School._6_Java_Data_Structure._11_HashMap;

import java.util.HashMap;                                  // Import HashMap class

public class _1_create_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();// create HashMap obj

        System.out.println(students);
    }
}
