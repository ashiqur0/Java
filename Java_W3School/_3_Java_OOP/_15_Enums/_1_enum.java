/*
Java Enums: group of constant
enum : is a special class that reperesent a group of constant (unchangable variable like final variables)

Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

*/

package Java_W3School._3_Java_OOP._15_Enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class _1_enum {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level);
    }
}
