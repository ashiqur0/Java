/*
Java Array : Array for, while, do-whle, for each
*/

package Java_Telusko.Java_W3School._1_Java_Tutorial._19_Arrays;

public class _2_loop_through_the_array {
    public static void main(String[] args) {
        String[] car = {"Ford", "Volvo", "Mazda", "BMW"};

        // access elemnts through for loop
        for (int i = 0; i < car.length; i++) {
            System.out.print(car[i] + " ");
        }
        System.out.println();

        // access elemnts through while loop
        int i = 0;
        while (i < car.length) {
            System.out.print(car[i++] + " ");
        }
        System.out.println();

        // access elemnts through do while loop
        int j = 0;
        do {
            System.out.print(car[j++] + " ");
        } while (j < car.length);
        System.out.println();

        // access elemnts through for each loop
        for (String s : car) {
            System.out.print(s + " ");
        } 
        System.out.println();
    }
}
