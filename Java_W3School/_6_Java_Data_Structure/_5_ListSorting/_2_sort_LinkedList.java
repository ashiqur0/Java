/*
List Sort : Sort LinkedList

*/

package Java_W3School._6_Java_Data_Structure._5_ListSorting;

import java.util.Collections;
import java.util.LinkedList;

public class _2_sort_LinkedList {
    public static void main(String[] args) {        
        
        // LinkedList Sort
        LinkedList<Integer> num = new LinkedList<>();
        num.addFirst(0);
        num.addFirst(1);
        num.addFirst(2);
        num.addFirst(3);
        num.addLast(5);
        num.addLast(4);
        num.addLast(6);
        
        Collections.sort(num);
        num.forEach( n -> System.out.print(n + " "));
    }
}
