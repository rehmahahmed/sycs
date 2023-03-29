#Aim: Design a program for creating a machine design that counts number of 0's and 1's

def machine(inp):
    ones = 0
    zeros = 0
    for i in inp:
        if i=="1":
            ones+=1
        if i=="0":
            zeros+=1
    print(" Zeros= ", zeros, end="")
    print(", Ones= ", ones, end="")
lang = ['1110', '10', '1', '0']
print("---Counting number of 0's and 1's---")
for i in lang:
    print("\n", i, ": ", end="")
    machine(i)