#!/bin/bash
# This script demonstrates how to define and use functions in Bash.

# A function is a block of code that can be called by name.
# This helps to organize code and reuse it.

# --- Method 1: Using the 'function' keyword ---
function greet {
  echo "Hello from the greet function!"
}

# --- Method 2: Using parentheses (more common) ---
say_goodbye() {
  echo "Goodbye!"
}

# --- Functions with arguments ---
# Arguments are passed to functions like command-line arguments to a script.
# $1 is the first argument, $2 is the second, and so on.
print_name() {
  if [ -z "$1" ]; then
    echo "No name provided to print_name function."
  else
    echo "The provided name is: $1"
  fi
}


# --- Calling the functions ---
echo "Calling the 'greet' function..."
greet

echo "Calling 'print_name' with and without an argument..."
print_name "Bob"
print_name

echo "Calling the 'say_goodbye' function..."
say_goodbye