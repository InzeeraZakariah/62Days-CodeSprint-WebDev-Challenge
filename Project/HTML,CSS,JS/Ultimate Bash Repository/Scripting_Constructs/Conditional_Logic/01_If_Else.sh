#!/bin/bash
# This script demonstrates conditional logic using if, elif, and else.

# Get a number from the first command-line argument.
NUMBER=$1

# Check if a number was provided.
# -z checks if the string is empty.
if [ -z "$NUMBER" ]; then
  echo "Usage: $0 <number>"
  exit 1
fi

# The `if` statement starts a conditional block.
# The condition is enclosed in square brackets [ ].
# `-gt` means "greater than".
if [ "$NUMBER" -gt 100 ]; then
  echo "The number is greater than 100."
# `elif` provides an "else if" condition.
# `-lt` means "less than".
elif [ "$NUMBER" -lt 100 ]; then
  echo "The number is less than 100."
else
  echo "The number is exactly 100."
fi

# The conditional block is closed with `fi` (if spelled backward).