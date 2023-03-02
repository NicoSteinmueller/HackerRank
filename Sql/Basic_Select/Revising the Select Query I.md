# [Revising the Select Query I](https://www.hackerrank.com/challenges/revising-the-select-query/problem)

**Difficulty:** Easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query all columns for all American cities in the **CITY** table with populations larger than _100000_. The **CountryCode** for America is _USA_.

The **CITY** table is described as follows: 

![img.png](attachments/Revising the Select Query I.png)

# Solution
````mysql
SELECT *
FROM CITY
WHERE population > 100000 AND Countrycode = 'USA';
````