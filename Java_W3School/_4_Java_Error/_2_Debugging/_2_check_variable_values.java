/*
Java Debugginh : Check Variable Values
If something unexpected happens, print out the values of your variables:

Debugging Checklist
Read the full error message, it often tells you exactly what's wrong
Check if all variables are initialized before use
Print variable values to trace the problem
Watch for off-by-one errors in loops and arrays
Comment out sections of code to find bugs

Debugging with IDEs
Modern IDEs like IntelliJ IDEA, Eclipse, and NetBeans come with built-in debugging tools.
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
