# [Java If-Else](https://www.hackerrank.com/challenges/java-if-else/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![img.png](img.png)</br>
Source: [Wikipedia](https://en.wikipedia.org/wiki/Conditional_%28computer_programming%29)

## Task
Given an integer, _n_, perform the following conditional actions:

If _n_ is odd, print Weird
If _n_ is even and in the inclusive range of _2_ to _5_, print _Not Weird_
If _n_ is even and in the inclusive range of _6_ to _20_, print _Weird_
If _n_ is even and greater than _20_, print _Not Weird_
Complete the stub code provided in your editor to print whether or not _n_ is weird.

## Input Format

A single line containing a positive integer, _n_.

## Constraints
**1<=n<=100**

## Output Format

Print _Weird_ if the number is weird; otherwise, print _Not Weird_.

## Sample Input 0
````Java
3
````

## Sample Output 0
````Java
Weird
````

## Sample Input 1
````Java
24
````

## Sample Output 1
````Java
Not Weird
````

##  Explanation

Sample Case 0: _n=3_ </br>
_n_ is odd and odd numbers are weird, so we print _Weird_.

Sample Case 1: _n=24_</br>
_n>20_ and _n_ is even, so it isn't weird. Thus, we print _Not Weird_.