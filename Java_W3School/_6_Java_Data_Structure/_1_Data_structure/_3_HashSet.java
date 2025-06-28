/*
Java Data Structure : HashSet
is a collection where each elements is unique- no duplicate are allowed.
indexing is not allowed. 
not ordered.
*/

package Java_W3School._6_Java_Data_Structure._1_Data_structure;

import java.util.HashSet;

public class _3_HashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("kiwi");

        System.out.println(fruits);
    }
}
