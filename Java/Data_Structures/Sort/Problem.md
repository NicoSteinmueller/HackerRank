# [Java Sort](https://www.hackerrank.com/challenges/java-sort/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. </br>
If two student have the same CGPA, then arrange them according to their first name in alphabetical order. </br>
If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

**Hint**: You can use comparators to sort a list of objects. See the [oracle docs](http://docs.oracle.com/javase/tutorial/collections/interfaces/order.html) to learn about comparators.

## Input Format

The first line of input contains an integer _N_, representing the total number of students. </br>
The next _N_ lines contains a list of student information in the following structure:
````java
ID Name CGPA
````

## Constraints
2 <= N <= 1000</br>
0 <= ID <= 100000</br>
5 <= |Name| <= 30</br>
0 <= CGPA <= 4.00

The name contains only lowercase English letters. The _ID_ contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.

## Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.

## Sample Input
````java
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
````

## Sample Output
````java
Ashis
Fahim
Samara
Samiha
Rumpa
````
