/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise43;

import org.junit.Test;

import static Exercise43.GenerateHTML.create_html;
import static org.junit.Assert.assertEquals;

public class Exercise43Test {
    @Test
    public void test_prompt_user(){
        String[] response = {"awesomeco","Max Power","y","y"};
        int actual = create_html(response);
        int expected = 1;

        assertEquals(expected,actual);
    }

}
