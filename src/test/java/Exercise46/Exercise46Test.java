/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise46;

import org.junit.Test;
import java.util.ArrayList;

import static Exercise46.Exercise46.get_animal_values;
import static Exercise46.ReadFile.*;
import static org.junit.Assert.assertEquals;

public class Exercise46Test {
    @Test
    public void test_read_file(){
        ArrayList<String> actual = read_file();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");

        assertEquals(actual.get(0),expected.get(0));
    }
    @Test
    public void test_read_file2(){
        ArrayList<String> actual = read_file();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("snake");

        assertEquals(actual.get(6),expected.get(0));
    }
    @Test
     public void test_get_animal_values(){
        ArrayList<String> actual = read_file();

        actual = get_animal_values(actual);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("snake");

        assertEquals(expected.get(0),actual.get(0));

    }
    @Test
    public void test_get_animal_values2(){
        ArrayList<String> actual = read_file();

        actual = get_animal_values(actual);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("mushroom");

        assertEquals(expected.get(0),actual.get(1));

    }
    @Test
    public void test_get_animal_values3(){
        ArrayList<String> actual = read_file();

        actual = get_animal_values(actual);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");

        assertEquals(expected.get(0),actual.get(2));

    }


}
