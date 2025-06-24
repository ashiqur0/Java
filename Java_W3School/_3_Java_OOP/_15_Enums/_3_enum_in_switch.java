/*
Java OOP : Enums: enum in switch statement
*/

package Java_W3School._3_Java_OOP._15_Enums;
enum Level {
    LOW,
    MEDIUM, 
    HIGH
}

public class _3_enum_in_switch {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        switch(level) {
            case LOW : 
                System.out.println("Low level.");
            break;
            case MEDIUM : 
                System.out.println("Medium level.");
            break;
            case HIGH : 
                System.out.println("High level.");
            break;
        }
    }
}
