# [Java List](https://www.hackerrank.com/challenges/java-list/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** Java (Basic)

For this problem, we have _2_ types of queries you can perform on a List:

1. Insert _y_ at index _x_:
````java
Insert
x y
````
2. Delete the element at index _x_:
````java
Delete
x
````

Given a list, _L_, of _N_ integers, perform _Q_ queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

## Input Format

The first line contains an integer, _N_ (the initial number of elements in _L_).</br>
The second line contains _N_ space-separated integers describing _L_.</br>
The third line contains an integer, _Q_ (the number of queries).</br>
The _2Q_ subsequent lines describe the queries, and each query is described over two lines:</br>
- If the first line of a query contains the String Insert, then the second line contains two space separated integers _x y_, and the value _y_ must be inserted into _L_ at index _x_.
- If the first line of a query contains the String Delete, then the second line contains index _x_, whose element must be deleted from _L_.

## Constraints
- 1 <= N <= 4000
- 1 <= Q <= 4000
- Each element in is a 32-bit integer.

## Output Format

Print the updated list _L_ as a single line of space-separated integers.

## Sample Input
````java
5
12 0 1 78 12
2
Insert
5 23
Delete
0
````

## Sample Output
````java
0 1 78 12 23
````

## Explanation
L = [12, 0, 1, 78, 12]</br>
Q<sub>0</sub>: **Insert** 23 at index _5_.</br>
L<sub>0</sub> = [12, 0, 1, 78, 12, 33]</br>
Q<sub>1</sub>: **Delete** the element at index _0_.</br>
L<sub>1</sub> = [0, 1, 78, 12, 33]</br>
Having performed all _Q_ queries, we print _L<sub>1</sub>_ as a single line of space-separated integers.