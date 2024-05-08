import re
from collections import Counter

def get_sentences(text):
    return re.split(r'(?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?)\s', text)

def summarize(text, num_sentences=3):
    sentences = get_sentences(text)
    word_freq = Counter(re.findall(r'\w+', text.lower()))
    sentence_scores = {sentence: sum(word_freq.get(word.lower(), 0) for word in re.findall(r'\w+', sentence)) for sentence in sentences if len(sentence.split(' ')) < 30}
    summary_sentences = sorted(sentence_scores, key=sentence_scores.get, reverse=True)[:num_sentences]
    return ' '.join(summary_sentences)

text = """
Natural language processing (NLP) is a subfield of linguistics, computer science, and artificial intelligence concerned with the interactions between computers and human language, in particular how to program computers to process and analyze large amounts of natural language data. The goal is a computer capable of "understanding" the contents of documents, including the contextual nuances of the language within them. The technology can then accurately extract information and insights contained in the documents as well as categorize and organize the documents themselves. The main focus of NLP research is on enabling computers to understand and process human language in order to extract meaning from text data and generate human-like responses.

One of the key tasks in NLP is text summarization, which involves reducing a text document or a set of documents to a concise summary that contains the most important information. There are two main approaches to text summarization: extractive and abstractive. Extractive summarization involves selecting and combining existing sentences or phrases from the source text to create a summary, while abstractive summarization involves generating new sentences that capture the essence of the original text.

Question-answering systems are another important application of NLP. These systems take a question expressed in natural language as input and provide a relevant answer based on the information available to them. Question-answering systems can be classified into different types depending on the nature of the questions they are designed to answer and the sources of information they use. Some question-answering systems rely on structured data sources such as databases or knowledge graphs, while others use unstructured text data such as web pages or documents.

Information extraction is a related task in NLP that involves automatically extracting structured information from unstructured text documents. This can include entities such as people, organizations, and locations, as well as relationships between them. Information extraction systems typically use techniques such as named entity recognition, part-of-speech tagging, and syntactic parsing to identify and extract relevant information from text data.
"""

summary = summarize(text)
print(summary)
