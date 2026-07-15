#!/bin/bash
# This script demonstrates a 'while' loop.

# A 'while' loop continues as long as its condition is true.

COUNTER=1

# This loop will run as long as the COUNTER variable is less than or equal to 5.
while [ $COUNTER -le 5 ]
do
  echo "Current count: $COUNTER"
  # It's important to change the variable inside the loop to avoid an infinite loop.
  let COUNTER=COUNTER+1
done

echo -e "\n--- Reading a file line by line ---"
# A common use for 'while' is to read a file line by line.
# Create a temporary file to read.
echo -e "First line\nSecond line\nThird line" > temp_file.txt

FILENAME="temp_file.txt"
while read -r line
do
  echo "Read line: $line"
done < "$FILENAME"

# Clean up the temporary file.
rm "$FILENAME"