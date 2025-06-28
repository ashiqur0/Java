/*
Java Data Structure : List
Characteristics: ordered, allow duplicates, support indexed
List is an interface, cannot create object directly. ArrayList and LinkedList class impliment List interface. So, we can create object of them.

ArrayList: fast access through index number
LinkedList: fast insert and remove operation
*/

package Java_W3School._6_Java_Data_Structure._2_Java_collections;

import java.util.ArrayList;

public class _2_List {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // add() method: add an element to the list
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // get() method: return value at specified index
        System.out.println(al.get(0));  // 10

        // set() method: update an elemet at specific index
        al.set(0, 100); 
        System.out.println(al.get(0));

        // remove() method: remove an element by index number
        al.remove(2);
        System.out.println(al.get(2));  // 40 as 30 is removed
    }
}
