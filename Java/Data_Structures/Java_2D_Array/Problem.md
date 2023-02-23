# [Java 2D Array](https://www.hackerrank.com/challenges/java-2d-array/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

You are given a _6*6_ 2D array. An hourglass in an array is a portion shaped like this:
````java
a b c
d
e f g
````

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
````java
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
````

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
````java
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
````

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

## Input Format

There will be exactly _6_ lines, each containing _6_ integers seperated by spaces. Each integer will be between _-9_ and _9_ inclusive.

## Output Format

Print the answer to this problem on a single line.

## Sample Input
````java
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
````

## Sample Output
````java
19
````

## Explanation

The hourglass which has the largest sum is:
````java
2 4 4
  2
1 2 4
````
