/*
Java File Handling : Write File

*/


package Java_W3School._5_File_Handling;

import java.io.FileWriter;
import java.io.IOException;


public class _3_write_file {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("Java_W3School\\_5_File_Handling\\my_file.txt");
            fr.write("Hello World");
            fr.close();
            System.out.println("File wrote successfully");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
