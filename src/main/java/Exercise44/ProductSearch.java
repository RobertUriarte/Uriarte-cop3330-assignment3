/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise44;

//Set up imports
import java.util.List;
import java.util.Scanner;

public class ProductSearch {
    public static Product main() {
        //Get Product List
        List<Product> products = ParseJsonFile.main();
        //Return product
        return search_for_product(products);
    }
    public static Product search_for_product(List<Product> products){
        //Set up scanner
        Scanner scan = new Scanner(System.in);
        //Initialize input
        String input;
        //Initialize boolean
        boolean is_there = false;
        //Initialize index
        int index = 0;
        //While loop to get user input
        while(!is_there){
            //Ask for input
            System.out.print("What is the product name? ");
            //Get input
            input = scan.nextLine();
            //Check if product exist
            for(int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().contains(input)) {
                    index = i;
                    is_there = true;
                    break;
                }
            }
            //Print statement for false case
            if(!is_there)
                System.out.println("Sorry, that product was not found in our inventory.");
        }
        //Return product
        return products.get(index);
    }
}