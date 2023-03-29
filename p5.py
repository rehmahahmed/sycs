#Aim: Design a program for creating a machine which accepts the string having equal number of 0's and 1's

def machine(inp):
    ones = 0
    zeros = 0
    for i in inp:
        if i == "1":
            ones+=1
        if i == "0":
            zeros+=1
    return ones == zeros
lang = ['10101010', '1111000', '000111001', '0011']
#lang = [Accepted, Rejected, Rejected, Accepted]
print("\n--To check equal number of 0's and 1's---")
for i in lang:
    if machine(i):
        print(i, "--> Accepted :)")
    else:
        print(i, "--> Rejected :(")