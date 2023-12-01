package year2015;

import simpleIO.Console;

/**
 * @author Mrs. Spindler
 * 
 *         The following is a sample problem from the 2015 contest. It
 *         demonstrates how to use Java to parse a String one character at a
 *         time. Visit https://adventofcode.com/2015/day/1 to see the full
 *         problem description
 *
 */

public class Day1 {

    // You will need to replace this with the input you are given 
    // (inputs are unique to every player)
    // But try it first with the samples in the problem!
    final static String input = "))(((((";

    public static void main(String[] args) {
        int currentFloor = 0;

        // this loop will access every character in the String
        for (int i = 0; i < input.length(); i++) {

            // extract a single character
            char character = input.charAt(i);

            // Determine whether this character will make us go up or down a floor
            if (character == '(') currentFloor++;
            else if (character == ')') currentFloor--;
            
        } // end loop

        // Output the result to enter into the website!
        Console.print(currentFloor);

    }

}
