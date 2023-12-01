package year2015;

import simpleIO.Console;

/**
 * @author Mrs. Spindler
 * 
 *         The following is a sample problem from the 2015 contest. It
 *         demonstrates how to use Java to parse a multi-lined String containing
 *         numbers. Visit https://adventofcode.com/2015/day/2 to see the full
 *         problem description
 *
 */

public class Day2 {

    // You will need to replace this with the input you are given 
    // (inputs are unique to every player)
    // But try it first with the samples in the problem!
    final static String input = "2x3x4\r\n"
            + "1x1x10";

    public static void main(String[] args) {
        // Variables needed for the calculations
        int length, width, height, area = 0;

        // lists of Strings; one to hold each line in the input, the other to break
        // apart the line into separate dimensions
        String[] lines, dimensions;

        lines = input.split("\r\n");

        for (int i = 0; i < lines.length; i++) {
            
            //Extra each dimension from the line of input
            dimensions = lines[i].split("x");

            // Change the dimensions into numbers so we can do some calculations
            length = Integer.parseInt(dimensions[0]);
            width = Integer.parseInt(dimensions[1]);
            height = Integer.parseInt(dimensions[2]);

            // formula for surface area: 2*l*w + 2*w*h + 2*h*l
            area += 2 * length * width + 2 * width * height + 2 * height * length;

            // Logic to determine the extra paper needed (smallest side)
            if (length >= width && length >= height) { // length is largest
                area += width * height; // leave out length
            } else if (width >= length && width >= height) { // width is largest
                area += length * height; // leave out width
            } else { // height is largest
                area += length * width; // leave out height
            }
        }

        // Output the result to enter into the website!
        Console.print(area);
    }

}
