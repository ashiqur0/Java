/*
List Sort : Sort ArrayList Alphabetically in Descending Order

*/

package Java_W3School._6_Java_Data_Structure._5_ListSorting;

import java.util.ArrayList;
import java.util.Collections;

public class _5_sort_Alphabetically {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Kiwi");
        fruits.add("Melon");
        fruits.add("Orenge");

        Collections.sort(fruits, Collections.reverseOrder());
        fruits.forEach(f -> System.out.print(f + " "));
    }
}
