#Aim: Write a program to create a machine that accepts 3 consecutive 1's

def machine(s):
    currstate = 0
    states = ['A', 'B', 'C', 'D']
    for c in s:
        print(f"{states[currstate]}--> ", end="")
        if currstate != 3:
            if c == 'a':
                currstate += 1
            else:
                currstate = 0
    print(states[currstate])
    if currstate == 3:
        print("String Accepte :)")
    else:
        print("String Rejected :(")
machine("aaabb") #Accepted
machine("aabb") #Rejected
