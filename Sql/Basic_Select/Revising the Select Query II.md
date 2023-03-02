# [Revising the Select Query II](https://www.hackerrank.com/challenges/revising-the-select-query-2/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query the **NAME** field for all American cities in the **CITY** table with populations larger than _120000_. The **CountryCode** for America is _USA_.

The **CITY** table is described as follows:

![img.png](attachments/City.png)

# Solution
````mysql
SELECT Name
FROM City
WHERE Population > 120000 AND Countrycode = 'USA';
````