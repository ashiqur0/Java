/*
Java switch : switch, case, break, default
Switch : used to check many expression at a time
*/

package Java_W3School._1_Java_Tutorial._15_Switch_case;

public class _1_switch {
    public static void main(String[] args) {
        int day = 7;
        switch (day) {
            case 1: 
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thusday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default: 
                System.out.println("Day is invalid");
                break;
        }
    }
}
