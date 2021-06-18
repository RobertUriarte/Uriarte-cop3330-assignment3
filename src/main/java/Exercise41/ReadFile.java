/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise41;

//Set up imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> main(String[] args) {
        //Get names
        ArrayList<String> names = read_file();
        //Return sorted names
        return sort_names(names);
    }
    public static ArrayList<String> read_file() {
        //Initialize file
        File input = new File("exercise41_input.txt");
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
    public static ArrayList<String> sort_names(ArrayList<String> names){
        //Sort names
        for(int i = 0; i < names.size()-1; i++){
            for(int j = 0; j < names.size()-i-1; j++){
                if(names.get(j).compareTo(names.get(j+1)) > 0){
                    String temp = names.get(j);
                    names.set(j,names.get(j+1));
                    names.set(j+1,temp);
                }
            }
        }
        //Return names
        return names;
    }
}
