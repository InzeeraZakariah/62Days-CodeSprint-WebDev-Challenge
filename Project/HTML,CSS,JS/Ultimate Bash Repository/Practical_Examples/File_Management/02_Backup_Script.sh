#!/bin/bash
# A simple script to back up a specified directory.

# --- Configuration ---
# The directory you want to back up.
SOURCE_DIR="/etc" 
# Where to store the backups.
BACKUP_DIR="/tmp/backups"
# The filename for the backup archive.
TIMESTAMP=$(date +"%Y%m%d_%H%M%S")
ARCHIVE_FILE="backup_${TIMESTAMP}.tar.gz"

# --- Script Logic ---

# Check if the source directory exists.
if [ ! -d "$SOURCE_DIR" ]; then
  echo "Error: Source directory $SOURCE_DIR does not exist."
  exit 1
fi

# Create the backup directory if it doesn't exist.
mkdir -p "$BACKUP_DIR"

echo "Backing up $SOURCE_DIR to $BACKUP_DIR/$ARCHIVE_FILE..."

tar -czf "$BACKUP_DIR/$ARCHIVE_FILE" "$SOURCE_DIR"

echo "Backup completed successfully."
ls -lh "$BACKUP_DIR"