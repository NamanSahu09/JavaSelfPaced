import pandas as pd
x = pd.read_csv(r"C:\Users\naman\OneDrive\Desktop\8836201-6f9306ad21398ea43cba4f7d537619d0e07d5ae3\iris.csv")

# Check if the dataset is loaded successfully
if x.empty:
    print("Dataset could not be loaded.")
else:
    print("Dataset loaded successfully.")
