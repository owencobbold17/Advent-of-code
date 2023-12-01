package year2020gr12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import simpleIO.Console;

/**
 * @author Mrs. Spindler
 * 
 *         The following is a sample problem from the 2020 contest. It
 *         demonstrates how to use Java to read from a file  
 *         containing numbers (integer type). 
 *         Visit https://adventofcode.com/2020/day/1 to see the full
 *         problem description
 *
 */

public class Day1 {

    // Create a file with your input and record the name here 
    // (inputs are unique to every player)
    // But try it first with the samples in the problem!
    final static String FILE_NAME = "data/SampleDay1_2020";

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader(FILE_NAME);
        BufferedReader stream = new BufferedReader(reader);

        ArrayList<String> lines = new ArrayList<String>();
        String line;
        
        //Read all lines of the file into a list of Strings
        while ((line = stream.readLine()) != null) {
            lines.add(line);
        }
        stream.close();
        
        //Convert all Strings to numbers
        int [] numbers = new int[lines.size()];

        //make an array of int types, so we can do some math
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(lines.get(i));
        }

        // searching through the array with multiple indices
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                // Part 1 - looking for 2 numbers that sum to 2020 - return their product
                if (numbers[i] + numbers[j] == 2020) {
                    
                    // Output the result to enter into the website!
                    Console.print("Part 1: ", false);
                    Console.print(numbers[i] * numbers[j]);
                }

                // Part 2 - looking for 3 numbers, loop again!
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 2020) {
                        
                        // Output the result to enter into the website!
                        Console.print("Part 2: ", false);
                        Console.print(numbers[i] * numbers[j] * numbers[k]);
                    }
                }
            }
        }

    }

}
