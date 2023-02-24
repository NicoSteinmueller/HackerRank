# [Java Comparator](https://www.hackerrank.com/challenges/java-comparator/problem)

**Difficulty:** medium
</br>**Points:** 10
</br>**Skill:** Java (Basic)

Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

The Player class is provided for you in your editor. It has _2_ fields: a _name_ String and a _score_ integer.

Given an array of _n_ Player objects, write a comparator that sorts them in order of decreasing score; if _2_ or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

## Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer, _n_, denoting the number of players.
Each of the _n_ subsequent lines contains a player's _name_ and _score_, respectively.

## Constraints
- 0 <= score <= 1000
- 2 players can have the same name.
- Player names consist of lowercase English letters.

## Output Format

You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

## Sample Input
````java
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
````

## Sample Output
````java
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
````
