/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise46;

//set up imports
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

//Class for reading files
public class ReadFile {
    public static ArrayList<String>  main(String[] args) {
        //return animal names
         return read_file();
    }
    public static ArrayList<String> set_up_array(ArrayList<String> animals,String[] split){
        //Get the length of the strings to run for loop
        int length = split.length;
        //add names to array list
        for(int i = 0; i < length; i++){
            animals.add(split[i]);
        }
        return animals;
    }
    public static ArrayList<String> read_file(){
        //Initialize file
        File input = new File("exercise46_input.txt");
        ArrayList<String> animals = new ArrayList<>();
        try {
            //Set up scanner
            Scanner scan = new Scanner(input);
            //Continue scanning until no lines left
            while (scan.hasNextLine()) {
                //Scan file
                String animal = scan.nextLine();
                //Split the line scanned by whitespace
                String[] split = animal.split(" ");
                //Store newly scanned lines somewhere
                set_up_array(animals,split);
            }
            //Set up file error case
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.print("Error");
        }

        //Return the names stored from the file
        return animals;
    }
}
