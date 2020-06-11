/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
TOPICS :: File Handling: Create, Read, Write, Delete
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.util.Scanner; // Import the Scanner class to read text files

public class Notes7 {

    public static void main(String[] args) {

        // Data file Handling in Java
        File myObj = new File("filename.txt"); //create an object of the class
        /*
            Methods of File: canRead, canWrite, createNewFile, delete, exists, getName, getAbsolutePath,
            length, list (Returns an array of the files in the directory), mkdir.
        */

        // create a file
        try {
            File myObj2 = new File("filename.txt");
            if (myObj2.createNewFile()) System.out.println("File created: " + myObj.getName());
            else System.out.println("File already exists.");
        }   // Output > File created: filename.txt
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // write on a file
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }   // Output > Successfully wrote to the file.
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // read a file
        try {
            File myObj3 = new File("filename.txt");
            Scanner myReader = new Scanner(myObj3);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }  // Output > Files in Java might be tricky, but it is fun enough!
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // delete a file
        File myObj4 = new File("filename.txt");
        if (myObj4.delete()) System.out.println("Deleted the file: " + myObj4.getName());
        else System.out.println("Failed to delete the file.");
        // Output > Deleted the file: filename.txt

    }
}
