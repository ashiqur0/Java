/*
Java Exceptions : Custome Exception
Throw : java throw keyword let you create custom exception

ArithmeticException, 
FileNotFoundException, 
ArrayIndexOutOfBoundsException, 
SecurityException
*/

package Java_W3School._4_Java_Error._3_Exceptons;

public class _4_Throw {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied");
        } else {
            System.out.println("Access granted..");
        }
    }
    
    public static void main(String[] args) {
        checkAge(20);
        checkAge(15);   
    }
}
