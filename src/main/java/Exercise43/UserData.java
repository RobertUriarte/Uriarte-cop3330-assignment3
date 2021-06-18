/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise43;

//Set up import
import java.util.Scanner;

public class UserData {
    public static String[] main(String[] args) {
        //Return responses
        return prompt_user();
    }
    public static String[] prompt_user(){
        //Initialize scanner
        Scanner scan = new Scanner(System.in);
        //Initialize response array
        String[] response = new String[4];
        //Scan responses
        System.out.print("Enter a site name: ");
        response[0] = scan.nextLine();
        System.out.print("Enter an author: ");
        response[1] = scan.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        response[2] = scan.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        response[3] = scan.nextLine();

        //Return responses
        return response;
    }
}
