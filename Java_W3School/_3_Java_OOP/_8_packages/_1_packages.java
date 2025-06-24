/*
Java OOP : Packages
A package in Java is used to group related classes.

Packages are divided into two categories:
    1. Built-in Packages (packages from the Java API)
    2. User-defined Packages (create your own packages)

import package.name.Class;   // Import a single class
import package.name.*;       // Import the whole package
*/

package Java_W3School._3_Java_OOP._8_packages;  // এটাই ইউজার ডিফাইন প্যাকেজ
import java.util.Scanner;                       // এটা Built-in Packages
public class _1_packages {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
    }
}
