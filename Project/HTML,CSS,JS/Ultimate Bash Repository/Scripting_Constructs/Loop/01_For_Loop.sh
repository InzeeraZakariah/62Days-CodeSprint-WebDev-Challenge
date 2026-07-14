#!/bin/bash
# This script demonstrates different ways to use 'for' loops in Bash.

echo "--- Loop 1: Iterating over a list of strings ---"
# The loop will assign each item in the list to the variable 'fruit' one by one.
for fruit in "Apple" "Banana" "Cherry"
do
  echo "Current fruit: ${fruit}"
done

echo -e "\n--- Loop 2: C-style loop for a range of numbers ---"
# This syntax is similar to for loops in C or JavaScript.
for (( i=1; i<=5; i++ ))
do
  echo "Count: ${i}"
done

echo -e "\n--- Loop 3: Iterating over files in a directory ---"
# The '*' is a wildcard that expands to all files and directories in the current path.
echo "Listing files in /etc that start with 'a':"
for item in /etc/a*
do
  # The -f flag checks if the item is a regular file.
  if [ -f "$item" ]; then
    echo "  File: $(basename "$item")"
  fi
done