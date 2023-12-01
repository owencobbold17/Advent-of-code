'''
The following is a sample problem from the 2020 contest. It
demonstrates how to use Python to parse a multi-lined String containing
information in groups, separated by blank lines. 
Visit https://adventofcode.com/2020/day/6 to see the full
problem description

@author: Karen Spindler
'''
# You will need to replace this with the input you are given
# (inputs are unique to every player)
# But try it first with the samples in the problem!

input_str = """abc

a
b
c

ab
ac

a
a
a
a

b"""

# List to hold each group of lines (look for double newline)
groups = input_str.split("\n\n")

# Part 1  - any question with a 'yes' must be counted
anyone_yes = 0

for group in groups:
    unique_questions = []
    
    # process each person's list of questions in the group
    people = group.split("\n")
    
    for person in people:
        # split into individual characters
        for question in person:
            # check every character in the question
            if unique_questions.count(question) == 0:
                # add to the list
                unique_questions.append(question)

    # length of list will give the number of questions for this group
    anyone_yes += len(unique_questions)
    
# Output the result to enter into the website
print(anyone_yes)
