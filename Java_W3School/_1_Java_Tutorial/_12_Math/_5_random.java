/*
Java Math : Math.random() method
Math.random() : returns random double value. To get integer value we need to typecast it to int
*/
public class _5_random {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 100));  // random number between 0 and 100
    }
}