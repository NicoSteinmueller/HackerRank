# [Java Loops II](https://www.hackerrank.com/challenges/java-loops/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

We use the integers _a_, _b_, and _c_ to create the following series:

(a+2<sup>0</sup>*b), (a+2<sup>0</sup>*b+2<sup>1</sup>), ..., (a+2<sup>0</sup>*b+2<sup>1</sup>*b+...+2<sup>n-1</sup>*b)

You are given _q_ queries in the form of _a_, _b_, and _c_. For each query, print the series corresponding to the given _a_, _b_, and _c_ values as _a_ single line of _n_ space-separated integers.

## Input Format

The first line contains an integer, _q_, denoting the number of queries.
Each line _i_ of the _q_ subsequent lines contains three space-separated integers describing the respective _a<sub>i</sub>_, _b<sub>i</sub>_, and _n<sub>i</sub>_ values for that query.

## Constraints

0 <= q <= 500
0 <= a,b <= 50
1 <= n <= 15

## Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of _n_ space-separated integers.

## Sample Input
````java
2
0 2 10
5 3 5
````

## Sample Output
````java
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
````

## Explanation

We have two queries:

1. We use a=0, b=2, and n=10 to produce some series s<sub>0</sub>, s<sub>1</sub>, ..., s<sub>n-1</sub>:</br>
s<sub>0</sub> = 0+1\*2 = 2</br>
s<sub>1</sub> = 0+1\*2+2\*2 = 6 </br>
s<sub>2</sub> = 0+1\*2+2\*2+4\*2 = 14

... and so on.

Once we hit n=10, we print the first ten terms as a single line of space-separated integers.

2. We use a=5, b=3, and n=5 to produce some series s<sub>0</sub>, s<sub>1</sub>, ..., s<sub>n-1</sub>:</br>
s<sub>0</sub> = 5+1\*3 = 8 </br>
s<sub>1</sub> = 5+1\*3+2\*3 = 14 </br>
s<sub>2</sub> = 5+1\*3+2\*3+4\*3 = 26 </br>
s<sub>3</sub> = 5+1\*3+2\*3+4\*3+8\*3 = 50 </br>
s<sub>4</sub> = 5+1\*3+2\*3+4\*3+8\*3+16\*3 = 98

We then print each element of our series as a single line of space-separated values.