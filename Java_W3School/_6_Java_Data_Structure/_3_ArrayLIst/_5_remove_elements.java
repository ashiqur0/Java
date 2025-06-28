/*
Java Data Structure : Remove elements form ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _5_remove_elements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Melon");
        fruits.add("Kiwi");

        fruits.remove(0);                   // removed: Apple
        System.out.println(fruits.get(0));  // output: Banana
    }
}
