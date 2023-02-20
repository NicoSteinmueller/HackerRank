# [Java Output Formatting](https://www.hackerrank.com/challenges/java-output-formatting/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

## Input Format

Every line of input will contain a String followed by an integer.</br>
Each String will have a maximum of _10_ alphabetic characters, and each integer will be in the inclusive range from _0_ to _999_.

## Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly _15_ characters.
The second column contains the integer, expressed in exactly _3_ digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

## Sample Input
````java
java 100
cpp 65
python 50
````

## Sample Output
````java
================================
java           100
cpp            065
python         050
================================
````

## Explanation

Each String is left-justified with trailing whitespace through the first _15_ characters. The leading digit of the integer is the _16th_ character, and each integer that was less than _3_ digits now has leading zeroes.