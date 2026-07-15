#!/bin/bash
# This script demonstrates the 'case' statement, which is useful for
# matching a variable against several patterns.

echo "What is your favorite primary color? (red, green, or blue)"
read COLOR

# The case statement starts with 'case' and ends with 'esac'.
case $COLOR in
  red|RED)
    echo "Red is a fiery color!"
    ;; # The ';;' terminates each pattern block.
  
  green|GREEN)
    echo "Green reminds me of nature."
    ;;
    
  blue|BLUE)
    echo "Blue is the color of the sky."
    ;;
    
  *) # The '*' is a wildcard pattern that matches anything else.
    echo "That's not one of the primary colors I was looking for."
    ;;
esac