/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise42;

//Set up imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> main(String[] args) {
        //Return names from file
        return read_file();
    }
    public static ArrayList<String> read_file() {
        //Initialize file
        File input = new File("exercise42_input.txt");
        //Initialize name array
        ArrayList<String> names = new ArrayList<>();
        try {
            //Set up scanner
            Scanner scan = new Scanner(input);
            //Continue scanning until no lines left
            while (scan.hasNextLine()) {
                //Scan file
                names.add(scan.nextLine());
            }
            //Set up file error case
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.print("Error");
        }

        //Return the names stored from the file
        return names;
    }
}

