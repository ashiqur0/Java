/*
Java Identifiers: Rules of using variables, Method name and Class Name
Identifiers : all variable name must be identified with unique name. These unique name is called identifiers
Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
Note: It is recommended to use descriptive names in order to create understandable and maintainable code:

The general rules for naming variables are: (collected from w3school's Java tutorial)
Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter, and cannot contain whitespace
Names can also begin with $ and _
Names are case-sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/

package Java_W3School._1_Java_Tutorial._7_Variables;

public class _4_Java_Identifiers {
    public static void main(String[] args) {
        int age = 25;
        int sum = 20;
        int minutePerHour = 60;
        System.out.println(age + " "+ sum + " " + minutePerHour);
    }
}
