/*
Java OOP : Class and Objects
Class : is a blueprint of an object
Object : that has properties and behavior
*/

package Java_Telusko._6_OOP;

class Calculator {
    int num1, num2;
    int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class _1_class_object {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 20;
        int result = calculator.sum(num1, num2);
        System.out.println(result);
    }
}
