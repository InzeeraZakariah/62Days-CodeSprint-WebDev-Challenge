#!/bin/bash
# This script displays a report of the current disk usage.

# The `df` command reports file system disk space usage.
# -h makes the output "human-readable" (e.g., 1K, 234M, 2G).
# -T shows the file system type.

echo "--- Full Disk Usage Report ---"
df -hT

echo -e "\n--- Filesystems with less than 20% free space ---"
# We can pipe the output of `df` to other commands for processing.
df -hT | tail -n +2 | awk '{
  # Remove the '%' from the 'Use%' column (column 6)
  usage = substr($6, 1, length($6)-1)
  if (usage > 80) {
    print $0
  }
}'

if [ $? -eq 0 ] && [ -z "$(df -hT | tail -n +2 | awk '{usage=substr($6,1,length($6)-1); if (usage>80) print $0}')" ]; then
    echo "All filesystems have more than 20% free space."
fi