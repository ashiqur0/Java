/*
Java Break Continue : Break-Continue
Break : Break the loop
Continue : Pass the loop to next iteration 
*/ 

package Java_Telusko.Java_W3School._1_Java_Tutorial._18_Break_Continue;

public class break_continue {
    public static void main(String[] args) {
        System.out.println("Break Statement");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i); // output : 1 2 3
        }

        System.out.println("Continue Statement");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i); // output : 1 2 3
        }
    }
}
