/*
Set : Check If An Elements Exists to the HashSet
*/

package Java_W3School._6_Java_Data_Structure._7_HashSet;

import java.util.HashSet;

public class _3_check_if_element_exists {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        students.add("Nahrul");
        students.add("Sabid");
        students.add("Samiul");

        System.out.println(students.contains("Sabid")); // true
        System.out.println(students.contains("Dipto")); // false
    }
}
