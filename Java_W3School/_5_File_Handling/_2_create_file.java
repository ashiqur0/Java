/*
Java File Handling : Create File

*/

package Java_W3School._5_File_Handling;

import java.io.File;        // Import the file class
import java.io.IOException; // Import the IO exception class to handle error

public class _2_create_file {
    public static void main(String[] args) {
        String file_path = "Java_W3School\\_5_File_Handling\\my_file.txt";
        try {
            File file = new File(file_path);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
