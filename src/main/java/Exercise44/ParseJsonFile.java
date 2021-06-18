/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise44;

//Set up imports
import java.io.*;
import java.util.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParseJsonFile {
    public static List<Product> main() {
        //Return product list
        return parse();
    }
    public static List<Product> parse() {
        //Initialize product list
        List<Product> products = new ArrayList<>();
        try {
            //Initialize File reader
            JsonElement fileElement = JsonParser.parseReader(new FileReader("exercise44_input.json"));
            //Get file as json object
            JsonObject fileObject = fileElement.getAsJsonObject();

            //Get products from json file
            JsonArray jsonArrayofProducts = fileObject.get("products").getAsJsonArray();
            //Get product values from json
            //Loop for number of products
            for(JsonElement productElement : jsonArrayofProducts){
                //Get json product
                JsonObject productJsonObject = productElement.getAsJsonObject();

                //Get name,price,& quantity
                String name = productJsonObject.get("name").getAsString();
                String price = productJsonObject.get("price").getAsString();
                String quantity = productJsonObject.get("quantity").getAsString();

                //Create product
                Product product = new Product(name,price,quantity);
                //Store product
                products.add(product);
            }
        }
        //Error case
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Return product list
        return products;
    }
}
