/*
Java File Handling : Delete File
*/


package Java_W3School._5_File_Handling;

import java.io.File;

public class _6_delete_file {
    public static void main(String[] args) {
        File myFile = new File("Java_W3School\\_5_File_Handling\\my_file.txt");
        if (myFile.delete()) {
            System.out.println(myFile.getName() + " deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
