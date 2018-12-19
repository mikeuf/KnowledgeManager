# Knowledge Manager Client
This is the desktop client that connects to a JAX-WS web application called Knowledge Manager. 

## Table of Contents
**[How to Run this Program](#how-to-run-this-program)**  
**[Overview](#overview)**<br /> 

## How to Run this Program
An executable file called **KnowledgeManagerClient.jar** is available here:<br />
https://github.com/mikeuf/KnowledgeManagerClient/raw/master/dist/KnowledgeManagerClient.jar<br /><br />
You may receive a message from your browser stating that the program is "not commonly downloaded and may be dangerous," or something to this effect. Your browser should give you the option to either discard or keep the file.

## Overview
This program allows you to choose from the following sorting algorithms:
* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort

Once numbers have been entered and a sort has been selected, SortController peforms a form validation check using regex. If the set passes the check, it is parsed into a list which is sent, by reference, to Library/Sorter.cs, which performs the actual algorithms. It also keeps track of each iteration so the user can see each step of the process.<br /><br />
The results include an "Additional Details" section which displays more information about each algorithm, including runtime complexity and additional notes. These details are stored in a SQLite database.<br /><br />
The data model is a combination of a DbSet of a SQLite table that is stored in an IEnumerable property, along with a few simple strings that are used to populate the views. The app also makes use of a partial view to maintain a consistent look without needless duplication of code.
<br /><br />
**Figure 1 - Insertion Sort**
![Insertion Sort](https://github.com/mikeuf/sorting-algorithms-asp/blob/master/1-insertion-sort.jpg "Insertion Sort")
<br /><br />
**Figure 2 - Validation Error**
![Validation Error](https://github.com/mikeuf/sorting-algorithms-asp/blob/master/2-validation-error.jpg "Validation Error")
