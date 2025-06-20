/*
Java OOP : Class and Objects
Class : is a blueprint of an object
Object : that has properties and behavior
*/

package Java_Telusko._6_OOP;

class Calculator {
    int num1 = 20;
    int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class _1_class_object {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();
        int num1 = 10;
        int num2 = 20;
        int result = calculator.sum(num1, num2);
        System.out.println(result);

        calculator2.num1 = 10;  // changing value of calculator2 object doesn't have effect on calculator object. because they are two different object.
        System.out.println("Num of calculator: " + calculator.num1);    // 20
        System.out.println("Num of calculator2: " + calculator2.num1);  // 10
    }
}
