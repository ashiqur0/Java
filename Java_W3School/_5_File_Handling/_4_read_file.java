/*
Java File Handling : Read File

*/

package Java_W3School._5_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _4_read_file {
    public static void main(String[] args) {
        try {
            File file = new File("Java_W3School\\_5_File_Handling\\my_file.txt");         
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            System.out.println("File read successfully");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
