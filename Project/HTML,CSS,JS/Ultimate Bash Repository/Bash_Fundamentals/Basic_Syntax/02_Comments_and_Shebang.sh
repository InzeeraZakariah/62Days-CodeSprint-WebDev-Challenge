#!/bin/bash

# This is a single-line comment. The interpreter ignores it.

# The line at the very top `#!/bin/bash` is the shebang.
# It is not a comment, but a directive to the operating system's program loader.
# It specifies the path to the interpreter that should be used to run the script.

echo "This line will be executed."

# You can use comments to explain complex parts of your script.
ls -l # Lists files in long format. This is an end-of-line comment.

# This line is commented out, so it will not run.
# echo "You will not see this message."