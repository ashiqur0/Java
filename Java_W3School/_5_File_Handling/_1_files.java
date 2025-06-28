/*
Java File Handling : java File 
File methods:

*/


package Java_W3School._5_File_Handling;

import java.io.File;                                    // Import the File class

public class _1_files {
    public static void main(String[] args) {
        File file = new File("my_file.txt");    // Specify the filename
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
