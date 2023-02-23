# [Java Hashset](https://www.hackerrank.com/challenges/java-hashset/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia). </br>
_{1,2,3}_ is an example of a set, but _{1,2,2}_ is not a set. Today you will learn how to use sets in java by solving this problem.

You are given  pairs of strings. Two pairs _(a,b)_ and _(c,d)_ are identical ifa _a=c_ and _b=d_. That also implies _(a,b)_ is not same as _(b,a)_. After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

## Input Format

In the first line, there will be an integer _T_ denoting number of pairs. Each of the next _T_ lines will contain two strings seperated by a single space.

## Constraints:
- 1 <= T <= 100000
- Length of each string is atmost _5_ and will consist lower case letters only.

## Output Format

Print _T_ lines. In the _i<sub>th</sub>_ line, print number of unique pairs you have after taking _i<sup>th</sup>_ pair as input.

## Sample Input
````java
5
john tom
john mary
john tom
mary anna
mary anna
````

## Sample Output
````java
1
2
2
3
3
````

## Explanation
- After taking the first input, you have only one pair: (john,tom)
- After taking the second input, you have two pairs: (john, tom) and (john, mary)
- After taking the third input, you still have two unique pairs.
- After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
- After taking the fifth input, you still have three unique pairs.
