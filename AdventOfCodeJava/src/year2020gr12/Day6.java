package year2020gr12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import simpleIO.Console;

/**
 * @author Mrs. Spindler
 * 
 *         The following is a sample problem from the 2020 contest. It
 *         demonstrates how to use Java to read from a file containing
 *         information in groups, separated by blank lines. 
 *         Visit https://adventofcode.com/2020/day/6 to see the full
 *         problem description
 *
 */

public class Day6 {

    // Create a file with your input and record the name here 
    // (inputs are unique to every player)
    // But try it first with the samples in the problem!
    final static String FILE_NAME = "data/SampleDay6_2020";

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader(FILE_NAME);
        BufferedReader stream = new BufferedReader(reader);

        String line;
        int anyoneYes = 0;
        
        //Read all lines of the file into a list of Strings
        while ((line = stream.readLine()) != null) {
            
            //keep all questions in a String - add as needed
            String uniqueQuestions = new String();
            
            //each group represents a group of people with "yes" answers
            //keep going until we reach a blank line
            while (line != null && ! line.isEmpty()) {
                
                //Part 1 - get each person's yes list
                
                //split up into individual characters
                char [] questions = line.toCharArray();
                
                //cycle through each character 
                for (int i = 0; i < questions.length; i++) {
                    
                    //only add a question if it's not been seen before 
                    if (uniqueQuestions.indexOf(questions[i]) == -1) {
                        uniqueQuestions += questions[i];
                    }
                }
        
                //get the next member of the group (may be a blank line!)
                line = stream.readLine();
            }

            
            //length of String will give the number of questions for this group
            anyoneYes += uniqueQuestions.length();

        }
        stream.close();

        // Output the result to enter into the website!
        Console.print("Anyone said yes: " + anyoneYes);
    }


}
