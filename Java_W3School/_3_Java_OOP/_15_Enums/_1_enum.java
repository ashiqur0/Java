/*
Java OOP : Enums
enum : is a special class that reperesent a group of constant (unchangable variable like final variables)

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
