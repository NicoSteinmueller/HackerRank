# [Java BigDecimal](https://www.hackerrank.com/challenges/java-bigdecimal/problem)

**Difficulty:** medium
</br>**Points:** 20
</br>**Skill:** Java (Basic)

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, _s_, of _n_ real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that _.1_ is printed as _0.1_, and _0.1_ is printed as _0.1_. 
If two numbers represent numerically equivalent values (e.g., _.1=0.1_), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array _s_'s elements according to the instructions above.

## Input Format

The first line consists of a single integer, _n_, denoting the number of integer strings.</br>
Each line _i_ of the _n_ subsequent lines contains a real number denoting the value of _s<sub>i</sub>_.

## Constraints
- _1 <= n <= 200_
- Each _s<sub>i</sub>_ has at most _300_ digits.

## Output Format

Locked stub code in the editor will print the contents of array _s_ to stdout. You are only responsible for reordering the array's elements.

## Sample Input
````java
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
````

## Sample Output
````java
90
56.6
50
02.34
0.12
.12
0
000.000
-100
````
