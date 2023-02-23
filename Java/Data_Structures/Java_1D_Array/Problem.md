# [Java 1D Array](https://www.hackerrank.com/challenges/java-1d-array-introduction/problem)

**Difficulty:** easy
</br>**Points:** 5
</br>**Skill:** Java (Basic)

An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.

Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we're going to have. 
For example, you might use an array to store a list of student ID numbers, or the names of state capitals. To create an array of integers named _myArray_ that can hold four integer values, you would write the following code:
````java
int[] myArray = new int[4];
````

This sets aside a block of memory that's capable of storing _4_ integers. Each integer storage cell is assigned a unique index ranging from _0_ to one less than the size of the array, and each cell initially contains a _0_. 
In the case of _myArray_, we can store integers at indices _0, 1, 2, and 3_. Let's say we wanted the last cell to store the number _12_; to do this, we write:
````java
myArray[3] = 12;
````

Similarly, we can print the contents of the last cell with the following code:
````java
System.out.println(myArray[3]);
````

The code above prints the value stored at index _3_ of _myArray_, which is _12_ (the value we previously stored there). It's important to note that while Java initializes each cell of an array of integers with a _0_, not all languages do this.

## Task

The code in your editor does the following:
1. Reads an integer from stdin and saves it to a variable, _n_, denoting some number of integers.
2. Reads _n_ integers corresponding to _a<sub>0</sub>, a<sub>1</sub>, ..., a<sub>n-1</sub>_ from stdin and saves each integer _a<sub>i</sub>_ to a variable, _a_.
3. Attempts to print each element of an array of integers named _a_.

Write the following code in the unlocked portion of your editor:
1. Create an array, _a_, capable of holding _n_ integers.
2. Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in _a<sub>0</sub>_, the second value must be stored in _a<sub>1</sub>_, and so on.

Good luck!

## Input Format

The first line contains a single integer, _n_, denoting the size of the array.

Each line _i_ of the _n_ subsequent lines contains a single integer denoting the value of element _a<sub>i</sub>_.

## Output Format

You are not responsible for printing any output to stdout. Locked code in the editor loops through array _a_ and prints each sequential element on a new line.

## Sample Input
````java
5
10
20
30
40
50
````

## Sample Output
````java
10
20
30
40
50
````

## Explanation

When we save each integer to its corresponding index in _a_, we get _a = [10, 20, 30, 40, 50]_. The locked code prints each array element on a new line from left to right.