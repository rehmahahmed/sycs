#Aim: Study and implement different tokenization methods

text = """Founded in 2002, SpacX's mission is to enable human's to become a spacefaring civilization and multiplanet species by building a self sustaining city on Mars. In 2008, SpaceX's Falcon 1 became the first privately developed liquid-fuel launch vehicle to orbit the Earth."""
print("Actual text: ")
print(text)

#Word Tokeniztion using python's split() function
print("\nWord Tokeniztion using python's split() function")
print(text.split())

#Sentence Tokeniztion using python's split() function
print("\nSentence Tokeniztion using python's split() function")
print(text.split("."))

#Tokeniztion using regular expressions
import re
sentences = re.compile('[.!?]').split(text)
print("\nTokeniztion using regular expressions")
print(sentences)

#working nltk code:

import nltk
#nltk.download('punkt')

#Word Tokeniztion using NLTK
print("\nWord Tokeniztion using NLTK")
print(nltk.word_tokenize(text))

#Sentence Tokeniztion using NLTK
print("\nSentence Tokeniztion using NLTK")
print(nltk.sent_tokenize(text))

"""
#Mam's code for nltk:

#Word Tokeniztion using NLTK
from nltk.tokenize import word.tokenize
print("\nWord Tokeniztion using NLTK")
print(word_tokenize(text))

#Sentence Tokeniztion using NLTK
from nltk.tokenize import sent.tokenize
print("\nSentence Tokeniztion using NLTK")
print(sent_tokenize(text))
"""

#Word Tokeniztion using spacy library
from spacy.lang.en import English
nlp = English()
my_doc = nlp(text)
token_list = []
for token in my_doc:
    token_list.append(token.text)
print("\nWord Tokeniztion using spacy library")
print(token_list)

#Sentence Tokeniztion using spacy library
from spacy.lang.en import English
nlp = English()
nlp.add_pipe('sentencizer')
doc = nlp(text)
sent_list = []
for sent in doc.sents:
    sent_list.append(sent.text)
print("\nSentence Tokeniztion using spacy library")
print(sent_list)
