/*
TreeSet : Add Elements to the TreeSet
TreeSet : stores unique elements, in sorted order
*/

package Java_W3School._6_Java_Data_Structure._8_TreeSet;

import java.util.TreeSet;

public class _2_add_elements {
    public static void main(String[] args) {
        TreeSet<String> car = new TreeSet<>();
        car.add("volvo");
        car.add("toyota");
        car.add("bmw");

        car.forEach(c -> System.out.print(c + " "));
    }
}
