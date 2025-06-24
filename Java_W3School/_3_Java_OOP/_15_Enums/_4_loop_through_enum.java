/*
Java Enums: loop through enum
*/

package Java_W3School._3_Java_OOP._15_Enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class _4_loop_through_enum {
    public static void main(String[] args) {
        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }
}
