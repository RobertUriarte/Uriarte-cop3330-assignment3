/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise43;

//Set up imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateHTML {
    public static String[] main(String[] args) {
        //Get responses
        String[] response = UserData.main(args);
        //Integer for testing
        int success = create_html(response);
        //Return responses
        return response;
    }

    public static int create_html(String[] response) {
        try {
            //Initialize file writer
            FileWriter write_to_file = new FileWriter("index.html");
            //Write to html
            write_to_file.write(
                    "<!doctype html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "\t<title>" + response[0] + "</title>\n" +
                    "\t<meta name=\"author\" content=\"" + response[1] + "\">\n" +
                    "</head>\n</html>");
            //Close file
            write_to_file.close();
            System.out.println("Successfully Written to output file.");
            //Error case
        } catch (
                IOException e) {
            System.out.println("Error");
            e.printStackTrace();
            return 0;
        }

        if(response[2].equals("y")) {
            String path = "js";
            //Initialize file
            File f1 = new File(path);
            //Create a folder
            boolean bool = f1.mkdir();
            if(bool){
                System.out.println("js folder create successfully");
            }
            //Error Case
            else{
                System.out.println("Error Found!");
                return 0;
            }
        }
        if(response[3].equals("y")) {
            String path = "CSS";
            //Initialize File
            File f2 = new File(path);
            //Create folder
            boolean bool2 = f2.mkdir();
            if(bool2){
                System.out.println("js folder create successfully");
            }
            //Error case
            else{
                System.out.println("Error Found!");
                return 0;
            }
        }
        return 1;
    }
}
