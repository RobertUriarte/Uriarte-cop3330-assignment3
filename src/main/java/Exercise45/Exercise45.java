/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise45;

//Set up imports
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        //Get newly made sentences
        String[] sentences = AlterData.main(args);
        //Scan user for output file name
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the name of the output file: ");
        String file_name = scan.nextLine();
        //Output file data
        output_data(sentences,file_name);
    }
    public static void output_data(String[] sentences,String file_name) {
        try {
            //Initialize file writer
            FileWriter write_to_file = new FileWriter(file_name + ".txt");
            //Output data
            for (int i = 0; i < sentences.length; i++) {
                write_to_file.write(sentences[i] + "\n");
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
