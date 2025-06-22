/*
Java loop : for each loop
for each loop : used for array, string, list etc to traversal
*/

package Java_W3School._1_Java_Tutorial._17_For_Loop;

public class _3_for_each {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};
        for (String f : fruits) {
            System.out.print( f + " ");
        }
    }
}
