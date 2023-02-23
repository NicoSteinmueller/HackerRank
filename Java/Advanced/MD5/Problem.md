# [Java MD5](https://www.hackerrank.com/challenges/java-md5/problem)

**Difficulty:** medium
</br>**Points:** 30
</br>**Skill:** 

MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a _128_-bit hash value. Here are some common uses for MD5:
- To store a one-way hash of a password.
- To provide some assurance that a transferred file has arrived intact.

MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, _1994_); however, the security of MD5 has been severely compromised, most infamously by the Flame malware in _2012_.</br> 
The CMU Software Engineering Institute essentially considers MD5 to be "[cryptographically broken and unsuitable for further use](https://en.wikipedia.org/wiki/MD5)".

Given an alphanumeric string, _s_, denoting a password, compute and print its MD5 encryption value.

## Input Format

A single alphanumeric string denoting _s_.

## Constraints
- 6 <= |s| <= 20
- String _s_ consists of English alphabetic letters (i.e., _[a-zA-Z]_ and/or decimal digits (i.e., _0_ through _9_) only.

## Output Format

Print the MD5 encryption value of _s_ on a new line.

## Sample Input 0
````java
HelloWorld
````

## Sample Output 0
````java
68e109f0f40ca72a15e05cc22786f8e6
````

## Sample Input 1
````java
Javarmi123
````

## Sample Output 1
````java
2da2d1e0ce7b4951a858ed2d547ef485
````

