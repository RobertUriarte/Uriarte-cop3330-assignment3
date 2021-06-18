/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise44;

public class Exercise44 {
    public static void main(String[] args) {
        //Get Product
        Product product = ProductSearch.main();
        //Print Product
        print_product(product);
    }
    public static void print_product(Product product){
        //Print product
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.print("Quantity: " + product.getQuantity());
    }
}
