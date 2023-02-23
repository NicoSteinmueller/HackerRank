# [Java Lambda Expressions](https://www.hackerrank.com/challenges/java-lambda-expressions/problem)

**Difficulty:** medium
</br>**Points:** 30
</br>**Skill:** 

This Java 8 challenge tests your knowledge of [Lambda expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)!

Write the following methods that return a lambda expression performing a specified action:
1. PerformOperation isOdd(): The lambda expression must return _true_ if a number is odd or _false_ if it is even.
2. PerformOperation isPrime(): The lambda expression must return _true_ if a number is prime or _false_ if it is composite.
3. PerformOperation isPalindrome(): The lambda expression must return _true_ if a number is a palindrome or _false_ if it is not.

## Input Format

Input is handled for you by the locked stub code in your editor.

## Output Format

The locked stub code in your editor will print _T_ lines of output.

## Sample Input

The first line contains an integer, _T_ (the number of test cases).

The _T_ subsequent lines each describe a test case in the form of _2_ space-separated integers:
The first integer specifies the condition to check for (_1_ for Odd/Even, _2_ for Prime, or _3_ for Palindrome). The second integer denotes the number to be checked.
````java
5
1 4
2 5
3 898
1 3
2 12
````

## Sample Output
````java
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
````
