#!/bin/bash
# This script demonstrates how to declare, use, and read variables in Bash.

# --- Declaring Variables ---
# Variables are assigned using the '=' operator. No spaces are allowed around it.
GREETING="Hello"
USER_NAME="Alice"

# --- Using Variables ---
# To use a variable, prefix its name with a '$'.
# It's good practice to enclose variable names in curly braces {}.
echo "${GREETING}, ${USER_NAME}!"

# --- Command Substitution ---
# The output of a command can be stored in a variable.
CURRENT_DATE=$(date +"%Y-%m-%d")
echo "Today's date is: ${CURRENT_DATE}"

# --- Reading User Input ---
echo "What is your favorite color?"
read FAVORITE_COLOR
echo "Your favorite color is: ${FAVORITE_COLOR}"