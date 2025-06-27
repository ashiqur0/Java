/*
Java Debugginh : Check Variable Values
If something unexpected happens, print out the values of your variables:
*/

package Java_W3School._4_Java_Error._2_Debugging;

public class _2_check_variable_values {
    public static void main(String[] args) {
       int age = 17;
       System.out.println("Age:" + age);
       
       if(age >= 18) {
        System.out.println("Access granted");
       } else {
        System.out.println("Access denied");
       }
    }
}
