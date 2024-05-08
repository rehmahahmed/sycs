from sklearn.metrics import precision_score, recall_score, f1_score, average_precision_score

def calculate_precision(true_positives, false_positives):
    if true_positives + false_positives == 0:
        return 0
    return true_positives / (true_positives + false_positives)

def calculate_recall(true_positives, false_negatives):
    if true_positives + false_negatives == 0:
        return 0
    return true_positives / (true_positives + false_negatives)

def calculate_f_measure(precision, recall):
    if precision + recall == 0:
        return 0
    return (2 * precision * recall) / (precision + recall)

# Custom evaluation
true_positives_custom = 80
false_positives_custom = 20
false_negatives_custom = 10

precision_custom = calculate_precision(true_positives_custom, false_positives_custom)
recall_custom = calculate_recall(true_positives_custom, false_negatives_custom)
f_measure_custom = calculate_f_measure(precision_custom, recall_custom)

print("Custom Evaluation:")
print("Precision:", precision_custom)
print("Recall:", recall_custom)
print("F-measure:", f_measure_custom)

# Evaluation using toolkit
y_true = [1, 0, 1, 1, 0, 1]
y_pred = [1, 1, 0, 1, 0, 0]

precision_toolkit = precision_score(y_true, y_pred)
recall_toolkit = recall_score(y_true, y_pred)
f1_toolkit = f1_score(y_true, y_pred)
average_precision_toolkit = average_precision_score(y_true, y_pred)

print("\nEvaluation using toolkit:")
print("Precision:", precision_toolkit)
print("Recall:", recall_toolkit)
print("F1-score:", f1_toolkit)
print("Average Precision:", average_precision_toolkit)
