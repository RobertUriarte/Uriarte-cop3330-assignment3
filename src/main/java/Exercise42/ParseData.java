/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise42;

//Set up import
import java.util.ArrayList;

public class ParseData {
    public static ArrayList<String> main(String[] args) {
        //Get not parsed names
        ArrayList<String> names = ReadFile.main(args);
        //Return parsed names
        return parsed_names(names);
    }

    public static ArrayList<String> parsed_names(ArrayList<String> names){
        //Initialize formatted_names array
        ArrayList<String> formatted_names = new ArrayList<>();
        for(int i = 0; i < names.size(); i++){
            //Parse based on ,
            String[] splits = names.get(i).split(",");
            int length = splits.length;
            //Add to formatted_names
            for(int j = 0; j < length; j++){
                formatted_names.add(splits[j]);
            }
        }
        //Return formatted_names
        return formatted_names;
    }

}
