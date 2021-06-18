/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise45;

import org.junit.Test;

import static Exercise45.AlterData.replace;
import static Exercise45.ReadFile.read_file;
import static org.junit.Assert.assertArrayEquals;

public class Exercise45Test {
    @Test
    public void test_read_file(){
        String[] expected = new String[3];
        expected[0] = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.";
        expected[1] = "For example, \"She uses an IDE to write her Java programs\" instead of \"She";
        expected[2] = "utilizes an IDE to write her Java programs\".        ";
        String[] actual = read_file();

       assertArrayEquals(expected,actual);
    }
    @Test
    public void test_replace(){
        String[] expected = new String[3];
        expected[0] = "One should never use the word \"use\" in writing. Use \"use\" instead.";
        expected[1] = "For example, \"She uses an IDE to write her Java programs\" instead of \"She";
        expected[2] = "uses an IDE to write her Java programs\".        ";
        String[] sentences = read_file();
        String[] actual = replace(sentences);

        assertArrayEquals(expected,actual);
    }

}
