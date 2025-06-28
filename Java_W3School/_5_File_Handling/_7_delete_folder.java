/*
Java File Handling : Delete Folder
*/

package Java_W3School._5_File_Handling;

import java.io.File;

public class _7_delete_folder {
    public static void main(String[] args) {
        File myFile = new File("Java_W3School\\_5_File_Handling\\test_folder");
        if (myFile.delete()) {
            System.out.println(myFile.getName() + " deleted successfully.");
        } else {
            System.out.println("Failed to delete the folder");
        }
    }
}
