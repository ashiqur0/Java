/*
Java Data Structure : Clear elements form ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _6_clear_elements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Kiwi");
        fruits.add("Melon");

        fruits.clear();
        System.out.println(fruits);  // output: [] emptyset: as all elements clear
    }
}
