/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise42;

//Set up imports
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Exercise42 {
    public static void main(String[] args) {
        //Get parsed names
        ArrayList<String> formatted_names = ParseData.main(args);
        //Output to output file
        output_data(formatted_names);
    }
    public static void output_data(ArrayList<String> formatted_names){
        try {
            //Initialize file writer
            FileWriter write_to_file = new FileWriter("exercise42_output.txt");
            //Output top of table
            write_to_file.write("Last\t  First \tSalary\n---------------------------\n");
            //Format table and print table
            for(int i = 0; i < formatted_names.size();){
                String format = String.format("%-10s",formatted_names.get(i));
                String format2 = String.format("%-10s",formatted_names.get(i+1));
                String format3 = String.format("%-10s",formatted_names.get(i+2));
                write_to_file.write(format);
                write_to_file.write(format2);
                write_to_file.write(format3 +"\n");
                i += 3;
            }

            //Close file
            write_to_file.close();
            System.out.println("Successfully Written to output file.");
            //Error case
        } catch (
                IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
