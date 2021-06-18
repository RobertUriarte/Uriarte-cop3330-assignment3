/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise42;

import org.junit.Test;
import java.util.ArrayList;

import static Exercise42.ParseData.parsed_names;
import static Exercise42.ReadFile.read_file;
import static org.junit.Assert.assertArrayEquals;


public class Exercise42Test {
    @Test
    public void test_read_file(){
        ArrayList<String> names = read_file();
        String[] actual = names.toArray(new String[0]);
        String[] expected = {"Ling,Mai,55900","Johnson,Jim,56500","Jones,Aaron,46000","Jones,Chris,34500","Swift,Geoffrey,14200","Xiong,Fong,65000","Zarnecki,Sabrina,51500"};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void test_ParseDate(){
        ArrayList<String> names = read_file();
        ArrayList<String> names2 = parsed_names(names);
        String[] actual = names2.toArray(new String[0]);
        String[] expected = {"Ling","Mai","55900","Johnson","Jim","56500","Jones","Aaron","46000","Jones","Chris","34500","Swift","Geoffrey","14200","Xiong","Fong","65000","Zarnecki","Sabrina","51500"};

        assertArrayEquals(expected,actual);
    }


}
