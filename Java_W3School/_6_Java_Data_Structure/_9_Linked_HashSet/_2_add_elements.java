/*
LinkedHashSet : Add Elements to the LinkedHashSet
*/

package Java_W3School._6_Java_Data_Structure._9_Linked_HashSet;

import java.util.LinkedHashSet;

class _2_add_elements {
    public static void main(String[] args) {
        LinkedHashSet<String> car = new LinkedHashSet<>();
        car.add("volvo");
        car.add("toyota");
        car.add("bmw");

        System.out.println(car);
    }
}