# [Java Regex 2 - Duplicate Words](https://www.hackerrank.com/challenges/duplicate-word/problem)

**Difficulty:** medium
</br>**Points:** 25
</br>**Skill:** Java (Basic)

In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. 
For example, the words _love_ and _to_ are repeated in the sentence _I love Love to To tO code_. Can you complete the code in the editor so it will turn _I love Love to To tO code_ into _I love to code_?

To solve this challenge, complete the following three lines:
1. Write a RegEx that will match any repeated word.
2. Complete the second compile argument so that the compiled RegEx is case-insensitive.
3. Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. 
It must be the exact first occurrence of the word, as the expected output is case-sensitive.

**Note**: This challenge uses a custom checker; you will fail the challenge if you modify anything other than the three locations that the comments direct you to complete. To restore the editor's original stub code, create a new buffer by clicking on the branch icon in the top left of the editor.

## Input Format

The following input is handled for you the given stub code:

The first line contains an integer, _n_, denoting the number of sentences.
Each of the _n_ subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.

## Constraints
- Each sentence consists of at most 10<sup>4</sup> English alphabetic letters and whitespaces.
- _1 <= n <= 100_

## Output Format

Stub code in the editor prints the sentence modified by the replaceAll line to stdout. The modified string must be a modified version of the initial sentence where all repeat occurrences of each word are removed.

## Sample Input
````java
5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB
````

## Sample Output
````java
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab
````

## Explanation
1. We remove the second occurrence of bye and the second and third occurrences of _world_ from _Goodbye bye bye world world world_ to get _Goodbye bye world_.
2. We remove the second occurrence of went and the second and third occurrences of to from _Sam went went to to to his business_ to get _Sam went to his business_.
3. We remove the second occurrence of is, the second occurrence of _the_, and the second occurrence of _eye_ from _Reya is is the the best player in eye eye game_ to get _Reya is the best player in eye game_.
4. The sentence _in inthe_ has no repeated words, so we do not modify it.
5. We remove the second occurrence of _ab_ from _Hello hello Ab aB_ to get _Hello Ab_. It's important to note that our matching is case-insensitive, and we specifically retained the first occurrence of the matched word in our final string.