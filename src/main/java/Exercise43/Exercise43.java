/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise43;

public class Exercise43 {
    public static void main(String[] args) {
        //Get responses
        String[] response = GenerateHTML.main(args);
        //Print out responses
        System.out.println("Created ./website/" + response[0]);
        System.out.println("Created ./website/" + response[0] + "/index.html");
        if(response[2].equals("y"))
            System.out.println("Created ./website/" + response[0] + "/js");
        if(response[3].equals("y"))
            System.out.print("Created ./website/" + response[0] + "/css");
    }

}
