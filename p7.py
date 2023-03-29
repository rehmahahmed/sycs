#Aim: Construct a DFA that accepts string over {0, 1} if and only if the value of the string, interpreted as binary representation into decimal/integer and is divisible by 2

def machine(s):
    state='A'
    for c in s:
        print(state, '-->', end="")
        if state == 'A':
            if c == '0':
                state='B'
            else:
                state='A'
        else:
            if c == '0':
                state = 'B'
            else:
                state='A'
    print(state)
    if state == 'B':
        print("String Accepted :)")
    else:
        print("String Rejected :(")
machine('100') #Accepted
machine('101') #Rejected