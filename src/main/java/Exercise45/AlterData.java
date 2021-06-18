/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package Exercise45;

public class AlterData {
    public static String[] main(String[] args) {
        //Get input file data
        String[] sentences = ReadFile.main(args);
        //Return replacement strings
        return replace(sentences);
    }
    public static String[] replace(String[] sentences){
        //Replace all occurrences of utilize
        for(int i = 0; i < sentences.length; i++){
            sentences[i] = sentences[i].replaceAll("utilize","use");
        }
        //Return replacements
        return sentences;
    }
}
