#!/bin/bash
# This script demonstrates basic file creation and writing.

FILENAME="report.txt"

echo "--- Creating and Writing to a File ---"

# The '>' operator redirects output to a file, overwriting it if it exists.
echo "Log file created on $(date)" > ${FILENAME}

# The '>>' operator appends output to a file.
echo "Status: OK" >> ${FILENAME}

echo "Created ${FILENAME} and wrote initial content."

echo -e "\n--- Displaying File Content ---"
cat ${FILENAME}

echo -e "\n--- Cleaning Up ---"
rm ${FILENAME}
echo "Deleted ${FILENAME}."