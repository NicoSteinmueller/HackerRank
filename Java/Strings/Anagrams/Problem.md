# [Java Anagrams](https://www.hackerrank.com/challenges/java-anagrams/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

Two strings, _a_ and _b_, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of _CAT_ are _CAT_, _ACT_, _tac_, _TCA_, _aTC_, and _CtA_.

## Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:
- string a: the first string
- string b: the second string

## Returns
- boolean: If _a_ and _b_ are case-insensitive anagrams, return true. Otherwise, return false.

## Input Format

The first line contains a string _a_.
The second line contains a string _b_.

## Constraints
- _1 <= length(a),length(b) <= 50_
- Strings _a_ and _b_ consist of English alphabetic characters.
- The comparison should NOT be case sensitive.

## Sample Input 0
````java
anagram
margana
````

## Sample Output 0
````java
Anagrams
````

## Explanation 0

Character|	Frequency: anagram|	Frequency: margana|
---|---|---|
A or a|	3|	3|
G or g|	1|	1|
N or n|	1|	1|
M or m|	1|	1|
R or r|	1|	1|

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

## Sample Input 1
````java
anagramm
marganaa
````

## Sample Output 1
````java
Not Anagrams
````

## Explanation 1

Character|	Frequency: anagramm|	Frequency: marganaa|
---|---|---|
A or a|	3|	4|
G or g|	1|	1|
N or n|	1|	1|
M or m|	2|	1|
R or r|	1|	1|
The two strings don't contain the same number of _a_'s and _m_'s, so we print "Not Anagrams".

## Sample Input 2
````java
Hello
hello
````

## Sample Output 2
````java
Anagrams
````

## Explanation 2

Character|	Frequency: Hello|	Frequency: hello|
---|---|---|
E or e|	1|	1|
H or h|	1|	1|
L or l|	2|	2|
O or o|	1|	1|
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".