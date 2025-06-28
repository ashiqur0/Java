/*
Java Data Structure : Iterator
An iterator is a way to loop through elements in a data structure.
It is called an "iterator" because "iterating" is the technical term for looping.
*/

package Java_W3School._6_Java_Data_Structure._1_Data_structure;

import java.util.ArrayList;
import java.util.Iterator;

class _5_Iterator {
    public static void main(String[] args) {

        // get the object of Integers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        // get the iterator for the ArrayList
        Iterator<Integer> it = nums.iterator();

        // iterate through the list using iterator
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}