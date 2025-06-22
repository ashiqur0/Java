/*
Java loop : real life example
real life example : count down 10 sec and execute Happy New Year
*/ 


package Java_W3School._1_Java_Tutorial._16_While_loop;

public class _3_real_life_example {
    public static void main(String[] args) {
        int n = 9;
        while (n >= 0) {
            System.out.println(n-- + " ");
        }
        System.out.println("Happy New Year");
    }
}
