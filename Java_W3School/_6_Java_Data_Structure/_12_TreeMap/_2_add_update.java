/*
Hash Map : Add or Update Values to the TreeMap

TreeMap: stores key-value pair, in a sorted order by key
*/

package Java_W3School._6_Java_Data_Structure._12_TreeMap;

import java.util.TreeMap;

public class _2_add_update {
    public static void main(String[] args) {
        TreeMap<Integer, String> employee = new TreeMap<>();
        employee.put(1021, "Sabid");
        employee.put(1023, "Pollob");
        employee.put(1029, "Arif");
        employee.put(1030, "Joy");
        employee.put(1021, "Sabidur Rahman"); // updates the value, as the key 1021 is already exists     
        System.out.println(employee);   
    }
}
