/*
Java String : String Concatination
*/

package Java_W3School._1_Java_Tutorial._11_Strings;

public class _2_Concatination {
    public static void main(String[] args) {

        // Concatination using + operator
        String firstName = "Md. Ashiqur";
        String lastName = "Rahman";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Concatination using .contate() method
        System.out.println("Full Name: " + firstName.concat(lastName));
    }
}
