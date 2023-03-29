#Aim: Design a program for creating a machine that ends with 101

def machine(s):
    currstate = 0
    states = ['A', 'B', 'C', 'D']
    for c in s:
        print(f"{states[currstate]}--> ", end="")
        if currstate == 0 and c=="1":
            currstate = 1
        elif currstate == 1 and c == "0":
            currstate = 2
        elif currstate == 2:
            if c == "1":
                currstate = 3
            else:
                currstate = 0
        elif currstate==3:
            if c=="0":
                currstate=2
            else:
                currstate=1
    print(states[currstate])
    if currstate == 3:
        print("String Accepted :)")
    else:
        print("String Rejected :(")
machine("0101") #Accepted
machine("1010") #Rejected