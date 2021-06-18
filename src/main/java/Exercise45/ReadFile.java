/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise45;

//Set up imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static String[] main(String[] args) {
        //Return input file strings
        return read_file();
    }
    public static String[] read_file(){
        //Initialize file
        File input = new File("exercise45_input.txt");
        //Initialize string array
        ArrayList<String> sentences = new ArrayList<>();
        try {
            //Set up scanner
            Scanner scan = new Scanner(input);
            //Continue scanning until no lines left
            while (scan.hasNextLine()) {
                //Scan file
                sentences.add(scan.nextLine());
            }
            //Set up file error case
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.print("Error");
        }

        //Return the sentences stored in file
        return sentences.toArray(new String[0]);
    }
}
