/*
Java Data Structure : Create LinkedList
LinkedList: is similar as ArrayList.

*/

package Java_W3School._6_Java_Data_Structure._4_LinkedList;

import java.util.LinkedList;                            // import LinkedList class

public class _1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();  // create LinkedList obj
        nums.add(10);                                 // add elements
        nums.add(20);
        nums.add(30);

        System.out.println(nums.get(2));          // access elements

        nums.set(0, 110);
        System.out.println(nums.get(0));          // 110 instead of 10
        nums.remove(2);                           // remove elements

        nums.clear();                                   // remove all elements
        System.out.println(nums.size());                // size of the LinkedList
        System.out.println(nums);

        // LinkedList mthod
        nums.addFirst(1000);
        nums.addLast(2000);
        
        System.out.println(nums.getFirst());            // 1000
        System.out.println(nums.getLast());             // 2000

        nums.removeFirst();
        nums.removeLast();
    }
}
