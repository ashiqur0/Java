/*
Java Array : Calculate the average of different ages
*/

package Java_Telusko.Java_W3School._1_Java_Tutorial._19_Arrays;

public class _3_real_life_example {
    public static void main(String[] args) {
        int[] age = {22, 21, 23, 19, 18, 20};
        int ageSum = 0;
        int numberOfPeople = age.length;
        for (int i = 0; i < age.length; i++) {
            ageSum += age[i];
        }

        System.out.println(ageSum / numberOfPeople); // 20
    }
}
