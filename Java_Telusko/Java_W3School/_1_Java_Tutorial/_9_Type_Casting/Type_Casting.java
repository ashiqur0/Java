/*
Java : Type Casting
Widening Type Casting : byte -> short -> char -> int -> long -> float -> double
Narrowing Type Casting : double -> float -> long -> int -> char -> short -> byte 
*/

package Java_Telusko.Java_W3School._1_Java_Tutorial._9_Type_Casting;

public class Type_Casting {
    public static void main(String[] args) {

        // Widening
        int myNum = 9;
        double myNum2 = myNum;
        System.out.println(myNum);  // 9
        System.out.println(myNum2); // 9.0

        // Narrowign 
        double myDouble = 9.78d;
        int myInt = (int)myDouble;
        System.out.println(myDouble);   // 9.78
        System.out.println(myInt);      // 9

        // Real Life example : calculate percentage of score based of max score
        int max_score = 500;
        int player_score = 432;
        float percentage = (float) player_score / max_score * 100.0f;
        System.out.println("Players percentage is : " + percentage);
    }
}
