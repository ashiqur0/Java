/*
Java Exceptions : Try Catch Finally 
Finally : when exception encountered, the code after that will not execute. in that case there some code must need to execute, ex. closing connection of database. the code we can put in finally block. the aimed to finally block of code will execute evenif exception handled or not. 
*/

package Java_W3School._4_Java_Error._3_Exceptons;

public class _3_Finally {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);
            System.out.println("this will not execute");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("this will execute");
        }
    }
}
