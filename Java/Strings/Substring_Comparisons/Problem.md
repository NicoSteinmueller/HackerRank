# [Java Substring Comparisons](https://www.hackerrank.com/challenges/java-string-compare/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

We define the following terms:

- [Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographical_order), also known as alphabetic or dictionary order, orders characters as follows:</br>
    _A < B < ... < Y < Z < a < b < ... < y < z </br>_
    For example, _ball < cat, dog < dorm, Happy < happy, Zoo < ball._
- A [substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of _abc_ are _a_, _b_, _c_, _ab_, _bc_, and _abc_.

- Given a string, _s_, and an integer, _i_, complete the function so that it finds the lexicographically smallest and largest substrings of length _k_.

## Function Description

Complete the getSmallestAndLargest function in the editor below.
</br>getSmallestAndLargest has the following parameters:
- string s: a string
- int k: the length of the substrings to find

## Returns
- string: the string ' + "\n" + ' where and are the two substrings

## Input Format

The first line contains a string denoting _s_.
The second line contains an integer denoting _k_.

## Constraints
- 1 <= |s| <= 1000
- consists of English alphabetic letters only (i.e., [a-zA-Z]).

## Sample Input 0
````java
welcometojava
3
````

## Sample Output 0
````java
ava
wel
````

## Explanation 0

String _s = "welcometojava"_ has the following lexicographically-ordered substrings of length _k = 3_:

_["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]_

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., _ava\nwel_).

The stub code in the editor then prints _ava_ as our first line of output and _wel_ as our second line of output.
