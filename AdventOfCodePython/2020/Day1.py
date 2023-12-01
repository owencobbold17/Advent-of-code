'''
The following is a sample problem from the 2020 contest. It
demonstrates how to use Python to parse a multi-lined String containing
numbers. Visit https://adventofcode.com/2020/day/1 to see the full
problem description

@author: Karen Spindler
'''
# You will need to replace this with the input you are given
# (inputs are unique to every player)
# But try it first with the samples in the problem!

input_str = """1721
979
366
299
675
1456"""

# List to hold each line of input
lines = input_str.split("\n")

# create a list to hold the numbers
numbers = []

for line in lines:
    numbers.append(int(line))
    
# now search through the number array for 2 numbers that add to 2020
i = 0

while i < len(numbers):
    j = i+1
    while j < len(numbers):
        if numbers[i] + numbers[j] == 2020:
            print (numbers[i] * numbers[j])
        j += 1  # next j
    i += 1  # next i
    

