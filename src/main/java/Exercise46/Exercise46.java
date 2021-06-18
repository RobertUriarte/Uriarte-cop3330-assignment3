/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise46;

//Set up imports
import java.util.ArrayList;
import java.util.List;

public class Exercise46 {
    public static void main(String[] args) {
        //Get animals array from file class
        ArrayList<String> animals = ReadFile.main(args);
        //Run animal function
        get_animal_values(animals);
    }

    public static ArrayList<String> get_animal_values(ArrayList<String> animals){
        //Initialize used animal name array
        ArrayList<String> used = new ArrayList<>();
        //Initialized counter array
        List<Integer> used_counter = new ArrayList<>();

        //Get size of animal array
        int length = animals.size();
        //Initialize size of of used animal array
        int length_used;
        //Create boolean for loop condition
        boolean is_used;

        //Loop for all values in animal array
        for(int i = 0; i < length; i++){
            //Get length of used array
            length_used = used.size();
            //Set boolean to false
            is_used = false;
            //Check if the current animal has already been used
            for(int k = 0; k < length_used; k++){
                if(animals.get(i).equals(used.get(k))){
                    //If animal has been used set boolean to true
                    is_used = true;
                    break;
                }
            }
            //If animal is not used check how many there are
            if(!is_used){
                //Add animal to used array and increment counter
                used.add(animals.get(i));
                used_counter.add(1);
                //Check for more animals with same name and increment counter
                for(int j = i + 1; j < length; j++){
                    if(animals.get(i).equals(animals.get(j)))
                        used_counter.set(length_used,used_counter.get(length_used) + 1);
                }
            }
        }
        //Sort animal array
        sort_animals(used,used_counter);
        //Sort counter array
        sort_animal_counter(used_counter);

        //Print results
        print_animals(used,used_counter);

        //Return used array
        return used;
    }

    public static void sort_animal_counter(List<Integer> used_counter){
        //Get length of counter array
        int length = used_counter.size();
        //Temp int for sort
        int temp;
        //sort array
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++)
            {
                if (used_counter.get(i) > used_counter.get(j)) {
                    temp = used_counter.get(i);
                    used_counter.set(i,used_counter.get(j));
                    used_counter.set(j,temp);
                }
            }
        }
    }
    public static void sort_animals(ArrayList<String> used,List<Integer> used_counter){
        //Get length of used
        int length = used.size();
        //temp for sort
        String temp;
        //sort counter array
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++)
            {
                if (used_counter.get(i) > used_counter.get(j)) {
                    temp = used.get(i);
                    used.set(i,used.get(j));
                    used.set(j,temp);
                }
            }
        }
    }

    public static void print_animals(ArrayList<String> used,List<Integer> used_counter){
        //Get length of used array
        int length = used.size();
        //Print sorted array from top to bottom
        for(int i = length-1; i >= 0; i--){
            System.out.printf("%s: ",used.get(i));
            //Print * for counter value
            for(int j = 0; j < used_counter.get(i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
