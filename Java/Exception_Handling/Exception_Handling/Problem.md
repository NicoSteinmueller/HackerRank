# [Java Exception Handling](https://www.hackerrank.com/challenges/java-exception-handling/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** Java (Basic)

You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method _long power(int, int)_. </br>
This method takes two integers, _n_ and _p_, as parameters and finds _n<sup>p</sup>_. If either _n_ or _p_ is negative, then the method must throw an exception which says "_n or p should not be negative_".</br> 
Also, if both _n_ and _p_ are zero, then the method must throw an exception which says "_n and p should not be zero_"

For example, -4 and -5 would result in _java.lang.Exception: n or p should not be negative_.

Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.

## Input Format

Each line of the input contains two integers, _n_ and _p_. The locked stub code in the editor reads the input and sends the values to the method as parameters.

## Constraints
- _-10 <= n <= 10_
- _-10 <= p <= 10_

## Output Format

Each line of the output contains the result _n<sup>p</sup>_, if both _n_ and _p_ are positive. If either _n_ or _p_ is negative, the output contains "n and p should be non-negative".</br> 
If both _n_ and _p_ are zero, the output contains "n and p should not be zero.". This is printed by the locked stub code in the editor.

## Sample Input 0
````java
3 5
2 4
0 0
-1 -2
-1 3
````

## Sample Output 0
````java
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
````

## Explanation 0
- In the first two cases, both _n_ and _p_ are postive. So, the power function returns the answer correctly.
- In the third case, both _n_ and _p_ are zero. So, the exception, "n and p should not be zero.", is printed.
- In the last two cases, at least one out of _n_ and _p_ is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
