/*
TreeSet : Loop Through TreeSet
*/


package Java_W3School._6_Java_Data_Structure._8_TreeSet;

import java.util.TreeSet;

public class _6_loop_through_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("kiwi");
        fruits.add("melon");

        for (String s : fruits) {
            System.out.print(s + " ");
        }
    }
}
