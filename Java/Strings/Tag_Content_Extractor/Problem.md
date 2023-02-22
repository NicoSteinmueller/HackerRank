# [Tag Content Extractor](https://www.hackerrank.com/challenges/tag-content-extractor/problem)

**Difficulty:** medium
</br>**Points:** 20
</br>**Skill:** Java (Basic)

In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like _\<tag>contents\</tag>_. Note that the corresponding end tag starts with a _/_.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
1. The name of the start and end tags must be same. The HTML code _\<h1>Hello World\</h2>_ is not valid, because the text starts with an _h1_ tag and ends with a non-matching _h2_ tag.
2. Tags can be nested, but content between nested tags is considered not valid. For example, in _\<h1>\<a>contents\</a>invalid\</h1>_, _contents_ is valid but _invalid_ is not valid.
3. Tags can consist of any printable characters.

## Input Format

The first line of input contains a single integer, _N_ (the number of lines).
The _N_ subsequent lines each contain a line of text.

## Constraints
- _1 <= N <= 100_
- Each line contains a maximum of _10<sup>4</sup>_ printable characters.
- The total number of characters in all test cases will not exceed _10<sup>6</sup>.

## Output Format

For each line, print the content enclosed within valid tags.</br>
If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print _None_.

## Sample Input
````java
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
````

## Sample Output
````java
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
````
