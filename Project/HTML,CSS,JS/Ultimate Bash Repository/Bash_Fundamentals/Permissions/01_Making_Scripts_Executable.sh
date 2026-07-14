#!/bin/bash

# In Unix-like systems, files need 'execute' permission to be run as programs.
# When you first create a script file, it usually does not have this permission.

# To grant execute permission, you use the `chmod` (change mode) command.
# The `+x` flag means "add execute permission".

# USAGE IN TERMINAL (don't run this inside the script):
# chmod +x your_script_name.sh

# After making it executable, you can run it from your terminal like this:
# ./your_script_name.sh

echo "If you can see this message, this script was made executable and run successfully!"