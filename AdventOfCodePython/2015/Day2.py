'''
The following is a sample problem from the 2015 contest. It
demonstrates how to use Python to parse a multi-lined String containing
numbers. Visit https://adventofcode.com/2015/day/2 to see the full
problem description

@author: Lawrence Wong, Karen Spindler
'''
# You will need to replace this with the input you are given
# (inputs are unique to every player)
# But try it first with the samples in the problem!

input_str = """2x3x4
1x1x10"""

# Variables needed for the calculations
area = 0

# List to hold each line of input
lines = input_str.split("\n")

for line in lines:

    # Extract each number from the line of input and put into a list
    dimensions = line.split("x")

    # Change the dimensions into line so we can do some calculations
    length = int(dimensions[0])
    width = int(dimensions[1])
    height = int(dimensions[2])

    # formula for surface area: 2*l*w + 2*w*h + 2*h*l
    area += 2 * length * width + 2 * width * height + 2 * height * length

    # Logic to determine the extra paper needed (smallest side)
    if length >= width and length >= height:  # length is largest
        area += width * height # leave out length
    elif width >= length and width >= height: # width is largest
        area += length * height # leave out width
    else: # height is largest
        area += length * width # leave out height

print(area)