package year2020gr11;

import simpleIO.Console;

/**
 * @author Mrs. Spindler
 * 
 *         The following is a sample problem from the 2020 contest. It
 *         demonstrates how to use Java to parse a multi-lined String 
 *         containing numbers (integer type). 
 *         Visit https://adventofcode.com/2020/day/1 to see the full
 *         problem description
 *
 */

public class Day1 {

    // You will need to replace this with the input you are given 
    // (inputs are unique to every player)
    // But try it first with the samples in the problem!
    final static String input = "1721\r\n"
            + "979\r\n"
            + "366\r\n"
            + "299\r\n"
            + "675\r\n"
            + "1456";
            
    public static void main(String[] args) {
        String[] line;
        int[] numbers;

        line = input.split("\r\n");

        //make an array of int types, so we can do some math
        numbers = new int[line.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
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
