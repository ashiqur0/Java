/*
Java loop : real life example
real life example : multiplication table for specific number
*/ 

package Java_Telusko.Java_W3School._1_Java_Tutorial._17_For_Loop;
public class _4_real_life_example {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Multiplication table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }
}
