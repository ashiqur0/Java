/*
Java loop : nested for loop
nested for loop : per form loop inside of a loop
*/
package Java_W3School._1_Java_Tutorial._17_For_Loop;

public class _2_nested_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Hello i " + i);
            for (int j = 1; j <= 2; j++) {
                System.out.println("Hello j " + j);
            }
            System.out.println();
        }
    }
}
