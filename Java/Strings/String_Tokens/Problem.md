# [Java String Tokens](https://www.hackerrank.com/challenges/java-string-tokens/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** Java (Basic)

Given a string, _s_, matching the regular expression _[A-Za-z !,?._'@]+_, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line.

**Note:** You may find the [String.split](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-) method helpful in completing this challenge.

## Input Format

A single string, _s_.

## Constraints
- _1 <= length of s <= 4*10<sup>5</sup>
- _s_ is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

## Output Format

On the first line, print an integer, _n_, denoting the number of tokens in string _s_ (they do not need to be unique). Next, print each of the _n_ tokens on a new line in the same order as they appear in input string _s_.

## Sample Input
````java
He is a very very good boy, isn't he?
````

## Sample Output
````java
10
He
is
a
very
very
good
boy
isn
t
he
````

## Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of _10_ such tokens in string _s_, and each token is printed in the same order in which it appears in string _s_.