'''
The following is a sample problem from the 2015 contest. It
demonstrates how to use Python to parse a String one character at a
time. Visit https://adventofcode.com/2015/day/1 to see the full
problem description

@author: Lawrence Wong, Karen Spindler
'''

# You will need to replace this with the input you are given
# (inputs are unique to every player)
# But try it first with the samples in the problem!
input_str = "))((((("
currentFloor = 0

# this loop will access every character in the String
for char in input_str:

    # Determine whether this character will make us go up or down a floor
    if char == "(":
        currentFloor += 1
    elif char == ")":
        currentFloor -= 1

# Output the result to enter into the website!
print(currentFloor)