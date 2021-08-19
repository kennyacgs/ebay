#!/bin/bash
echo "enter the filename"
read filename
touch $filename
ls -l $filename
