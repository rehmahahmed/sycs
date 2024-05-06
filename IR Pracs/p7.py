from sklearn.feature_extraction.text import CountVectorizer, TfidfTransformer
import nltk
from nltk.corpus import stopwords
import numpy as np
from numpy.linalg import norm

train_set = ["The sky is blue.", "The sun is bright."]
test_set = ["The sun in the sky is bright."]

nltk.download('stopwords')
stopWords = stopwords.words('english')

vectorizer = CountVectorizer(stop_words = stopWords)
transformer = TfidfTransformer()

trainVectorizerArray = vectorizer.fit_transform(train_set).toarray()
testVectorizerArray = vectorizer.transform(test_set).toarray()

print('Fit vectorizer to train set:\n', trainVectorizerArray, "\n")
print('Transform Vectorizer to test set:', testVectorizerArray)

cx = lambda a,b:round(np.inner(a,b)/(norm(a)*norm(b)),3)

for vector in trainVectorizerArray:
    print(vector)
    for testV in testVectorizerArray:
        print(testV)
        cosine = cx(vector, testV)
        print(cosine)

transformer.fit(trainVectorizerArray)
print()
print(transformer.transform(trainVectorizerArray).toarray())
transformer.fit(testVectorizerArray)
print()
tfidf = transformer.transform(testVectorizerArray)
print(tfidf.todense())
