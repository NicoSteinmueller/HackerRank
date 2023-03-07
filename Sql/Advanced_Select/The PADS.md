# [The PADS](https://www.hackerrank.com/challenges/the-pads/problem)

**Difficulty:** medium
</br>**Points:** 30
</br>**Skill:** SQL (Basic)

# Problem
Generate the following two result sets:

1. Query an alphabetically ordered list of all names in **OCCUPATIONS**, immediately followed by the first letter of each profession as a parenthetical (i.e.: enclosed in parentheses). For example: _AnActorName(A)_, _ADoctorName(D)_, _AProfessorName(P)_, and _ASingerName(S)_.
2. Query the number of ocurrences of each occupation in OCCUPATIONS. Sort the occurrences in ascending order, and output them in the following format:
````mysql
There are a total of [occupation_count] [occupation]s.
````
where _[occupation_count]_ is the number of occurrences of an occupation in **OCCUPATIONS** and _[occupation]_ is the lowercase occupation name. If more than one Occupation has the same _[occupation_count]_, they should be ordered alphabetically.

**Note**: There will be at least two entries in the table for each type of occupation.

## Input Format

The **OCCUPATIONS** table is described as follows:

![img.png](attachments/The PADS Format.png)

Occupation will only contain one of the following values: **Doctor**, **Professor**, **Singer** or **Actor**.

## Sample Input

An **OCCUPATIONS** table that contains the following records:

![img.png](attachments/The PADS Input.png)

## Sample Output
````mysql
Ashely(P)
Christeen(P)
Jane(A)
Jenny(D)
Julia(A)
Ketty(P)
Maria(A)
Meera(S)
Priya(S)
Samantha(D)
There are a total of 2 doctors.
There are a total of 2 singers.
There are a total of 3 actors.
There are a total of 3 professors.
````

## Explanation

The results of the first query are formatted to the problem description's specifications.
The results of the second query are ascendingly ordered first by number of names corresponding 
to each profession (2 <= 2 <= 3 <= 3), and then alphabetically by profession (doctor <= singer, and actor <= professor).

# Solution
````mysql
SELECT Name , Concat('(',LEFT(OCCUPATION,1),')')
FROM OCCUPATIONS
ORDER BY Name;
SELECT CONCAT('There are a total of ', countOCC, ' ',OCCUPATION,'.')
FROM (Select DISTINCT *
FROM (SELECT COUNT(OCCUPATION) as countOCC, OCCUPATION From OCCUPATIONS GROUP BY OCCUPATION) as temp
ORDER BY countOCC, OCCUPATION) as temp2;

````