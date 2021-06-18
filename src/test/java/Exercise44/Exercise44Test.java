/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise44;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static Exercise44.ParseJsonFile.parse;
import static org.junit.Assert.assertEquals;

public class Exercise44Test {
    @Test
    public void test_parse_function(){
        List<Product> products = new ArrayList<>();
        Product product = new Product("Widget","25.00","5");
        products.add(product);
        Product product2 = new Product("Thing","15.00","5");
        products.add(product2);
        Product product3 = new Product("Doodad","5.00","10");
        products.add(product3);

        List<Product> products2 = parse();

        assertEquals(products.get(0).getName(),products2.get(0).getName());
    }
    public void test_parse_function2(){
        List<Product> products = new ArrayList<>();
        Product product = new Product("Widget","25.00","5");
        products.add(product);
        Product product2 = new Product("Thing","15.00","5");
        products.add(product2);
        Product product3 = new Product("Doodad","5.00","10");
        products.add(product3);

        List<Product> products2 = parse();

        assertEquals(products.get(1).getName(),products2.get(1).getName());
    }
    public void test_parse_function3(){
        List<Product> products = new ArrayList<>();
        Product product = new Product("Widget","25.00","5");
        products.add(product);
        Product product2 = new Product("Thing","15.00","5");
        products.add(product2);
        Product product3 = new Product("Doodad","5.00","10");
        products.add(product3);

        List<Product> products2 = parse();

        assertEquals(products.get(2).getName(),products2.get(2).getName());
    }
}
