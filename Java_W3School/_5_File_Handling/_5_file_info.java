/*
Java File Handling : File Info
*/

package Java_W3School._5_File_Handling;

import java.io.File;

public class _5_file_info {
    public static void main(String[] args) {
        File myFile = new File("Java_W3School\\_5_File_Handling\\my_file.txt");
        if (myFile.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canWrite());
            System.out.println("File Size: " + myFile.length());
        } else {
            System.out.println("An errore occured");
        }
    }
}
 