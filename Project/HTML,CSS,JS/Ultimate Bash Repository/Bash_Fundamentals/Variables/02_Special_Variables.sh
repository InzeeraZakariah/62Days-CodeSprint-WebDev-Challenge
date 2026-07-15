#!/bin/bash
# This script demonstrates some of Bash's special, built-in variables.

echo "Script name: $0"
echo "First argument: $1"
echo "Second argument: $2"
echo "All arguments as a single string: $*"
echo "All arguments as separate strings: $@"
echo "Number of arguments: $#"
echo "Exit status of the last command: $?"
echo "Process ID of the current script: $$"

# To test this, run the script with some arguments:
# ./02_Special_Variables.sh first_arg "second arg" third