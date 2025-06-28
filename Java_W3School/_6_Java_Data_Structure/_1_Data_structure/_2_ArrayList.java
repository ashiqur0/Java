/*
Java Data Structure : ArrayList
ArrayList is resizable array that can grow as needed

*/

package Java_W3School._6_Java_Data_Structure._1_Data_structure;

import java.util.ArrayList;

public class _2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("kiwi");

        System.out.println(fruits);
    }
}
