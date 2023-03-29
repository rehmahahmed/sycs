#Aim: construct a pushdown automata for all length palindrome for languag {wc, wr} w={a, b}, w is string and wr is reverse of string and c is the constant, implement by using stack

def machine(s):
    idx = 0
    stack = ['z0']
    while s[idx] != '$':
        stack.append(s[idx])
        idx+=1
    for i in range(idx+1, len(s)):
        if s[i]!=stack.pop():
            return False
    return stack.pop()
print("String: 'ab$ba'")
if machine('ab$ba') == 'z0':
    print("Accepted :)")
else:
    print("Rejected :(")