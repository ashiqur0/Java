/*
Java Data Structure : For each Loop with an ArrayList

*/


package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _9_foreach_loop_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Murad");
        students.add("Ashiqur");
        students.add("Alim");
        students.add("Rabbi");
        students.add("Munna");

        for (String name : students) {
            System.out.println(name);
        }
    }
}
