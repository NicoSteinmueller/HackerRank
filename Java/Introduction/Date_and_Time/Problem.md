# [Java Date and Time](https://www.hackerrank.com/challenges/java-date-and-time/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** Java (Basic)

The[ Calendar class](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, _getDay_, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

## Example
_month = 8_
_day = 14_
_year = 2017_

The method should return _MONDAY_ as the day on that date.

![img.png](img.png)

## Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month</br>
int: day</br>
int: year</br>

##  Returns

string: the day of the week in capital letters

## Input Format

A single line of input containing the space separated month, day and year, respectively, in _MM DD YYYY_ format.

## Constraints
2000 < year < 3000

## Sample Input
````java
08 05 2015
````

## Sample Output
````java
WEDNESDAY
````


## Explanation

The day on August 5th 2015 was WEDNESDAY.