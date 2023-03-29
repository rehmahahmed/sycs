#Aim: Write a program for generating regular expression for regular grammar

import re
line = "Cats are smarter than Dogs"
searchobj = re.search(r'(.*) are (.*?) .*', line, re.M | re.I)
if searchobj:
    print("searchobj.group(): ", searchobj.group())
    print("searchobj.group(1): ", searchobj.group(1))
    print("searchobj.group(2): ", searchobj.group(2))
else:
    print("Nothing Found")