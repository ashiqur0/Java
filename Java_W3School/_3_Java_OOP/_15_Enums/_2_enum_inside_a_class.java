/*
Java Enums: enum inside a class
enum : is a special class that reperesent a group of constant (unchangable variable like final variables)
*/

package Java_W3School._3_Java_OOP._15_Enums;

class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
}

public class _2_enum_inside_a_class {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level);
    }
}
