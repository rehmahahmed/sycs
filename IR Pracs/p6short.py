docs = {1: "apple banana orange", 2: "apple banana", 3: "banana orange", 4: "apple"}
index = {term: {doc_id for doc_id, text in docs.items() if term in text.split()} for text in docs.values() for term in set(text.split())}

def boolean_and(operands):
    return list(set.intersection(*(index.get(term, set()) for term in operands))) if operands else list(range(1, len(docs) + 1))

def boolean_or(operands):
    return list(set.union(*(index.get(term, set()) for term in operands)))

def boolean_not(operand):
    return list(set(docs.keys()).difference(index.get(operand, set())))

result1 = boolean_and(["apple", "banana"])
result2 = boolean_or(["apple", "orange"])
result3 = boolean_not("orange")

print("Documents containing 'apple' and 'banana':", result1)
print("Documents containing 'apple' or 'orange':", result2)
print("Documents not containing 'orange':", result3)
print("Performed by 04")
