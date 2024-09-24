###Steps to push the new project to Git###

#############################################################################################

echo "# SolidPrinciple" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/fakirmohan-github/SolidPrinciple.git
git push -u origin main

##############################################################################################

In Project Directory Path

git init   — This will add the .git folder so that git can track all the changes.
git status  — check the status
git add .   —Instead adding 1 by 1 file With this command will add all the 				changes files inside the folder.
git commit -m "Sample Commit";  — Commit to Local branch
git remote add origin https://github.com/fakirmohan-github/Java8Features.git. — Push to remote branch created in Github.


#######################################   MAP vs FLATMAP #####################################

How Map works in Java 8

The Stream.map() function performs map functional operation i.e. it takes a Stream and transforms it to another new Stream.

It applies a function on each element of Stream and stores return value into new Stream.

The map operation takes a Function, which is called for each value in the input stream and produces one result value, which is sent to the output stream.


How Flat Map works in java 8

Is the combination of a map and a flat operation

This means you first apply the map function and then flattens the result.

The key difference is the function used by map operation returns a Stream of values or a list of values rather than a single value, that's why we need flattening. When you flat a Stream of Stream, it gets converted into Stream of values.

To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ] which has "two levels". It's basically a big List containing three more List.  Flattening this means transforming it in a "one level" structure e.g. [ 1,2,3,4,5,6,7,8,9 ] i.e. just one list.

In short,
Before flattening - Stream of List of Integer
After flattening - Stream of Integer