# [Japanese Cities' Attributes](https://www.hackerrank.com/challenges/japanese-cities-attributes/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query all attributes of every Japanese city in the **CITY** table. The **COUNTRYCODE** for Japan is _JPN_.

The **CITY** table is described as follows: 

![img.png](attachments/City.png)

# Solution
````mysql
SELECT  *
FROM City
WHERE Countrycode = 'JPN';
````