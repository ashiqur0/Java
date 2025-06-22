/*
Java : Real Life Example of Data Types
*/

package Java_W3School._1_Java_Tutorial._8_Data_Types;

public class _6_Real_Life_Example {
    public static void main(String[] args) {
        // Calculate total cost
        int items = 50;
        float costPerItem = 9.97f;
        float totalCost = items * costPerItem;
        char currency = '$';
        System.out.println("Number of items : " + items);
        System.out.println("Cost per item : " + items + currency);
        System.out.println("Total cost : " + totalCost + currency);
    }
}
