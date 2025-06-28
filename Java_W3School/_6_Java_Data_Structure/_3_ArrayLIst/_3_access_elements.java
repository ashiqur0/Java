/*
Java Data Structure : Access elements of ArrayList

*/

package Java_W3School._6_Java_Data_Structure._3_ArrayLIst;

import java.util.ArrayList;

public class _3_access_elements {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("volvo");
        car.add("toya");
        car.add("tesla");
        car.add("bmw");

        System.out.println(car.get(0));     // volvo
    }    
}
