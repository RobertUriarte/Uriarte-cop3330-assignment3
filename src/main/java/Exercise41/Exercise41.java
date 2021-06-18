/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise41;

//Set up imports
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;


public class Exercise41 {
    public static void main(String[] args) {
        //Get sorted names
        ArrayList<String> names = ReadFile.main(args);
        //File output sorted names
        output_to_file(names);
    }
    public static void output_to_file(ArrayList<String> names){
        try {
            //Initialize file writer
            FileWriter write_to_file = new FileWriter("exercise41_output.txt");
            //Output number of names
            write_to_file.write("Total of " + names.size() + " names\n--------------\n");
            //Print all names
            for(int i = 0; i < names.size(); i++)
                write_to_file.write(names.get(i) + "\n");
            //Close file
            write_to_file.close();
            System.out.println("Successfully Written to output file.");
            //Error case
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
