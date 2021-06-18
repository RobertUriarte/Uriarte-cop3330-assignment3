/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise41;

import org.junit.Test;

import java.util.ArrayList;

import static Exercise41.ReadFile.read_file;
import static Exercise41.ReadFile.sort_names;
import static org.junit.Assert.assertArrayEquals;

public class Exercise41Test {
    @Test
    public void test_read_file() {
        ArrayList<String> names = read_file();
        String[] actual = names.toArray(new String[0]);
        String[] expected = {"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina","Jones, Chris","Jones, Aaron","Swift, Geoffrey","Xiong, Fong"};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void test_sort_names() {
        ArrayList<String> names = read_file();
        ArrayList<String> sorted_names = sort_names(names);
        String[] actual = sorted_names.toArray(new String[0]);
        String[] expected = {"Johnson, Jim","Jones, Aaron","Jones, Chris","Ling, Mai","Swift, Geoffrey", "Xiong, Fong","Zarnecki, Sabrina"};
        assertArrayEquals(expected,actual);
    }

}
