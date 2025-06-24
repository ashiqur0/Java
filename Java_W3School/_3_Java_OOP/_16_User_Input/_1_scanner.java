/*
Java User Input: String Input nextLine() method
*/

package Java_W3School._3_Java_OOP._16_User_Input;

import java.util.Scanner;

public class _1_scanner {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Username: " + userName);
    }
}
