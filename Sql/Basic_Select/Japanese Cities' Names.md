# [Japanese Cities' Names](https://www.hackerrank.com/challenges/japanese-cities-name/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query the names of all the Japanese cities in the **CITY** table. The **COUNTRYCODE** for Japan is _JPN_.
The **CITY** table is described as follows: 

![City.png](attachments%2FCity.png)

#Solution
````mysql
SELECT Name
FROM City
WHERE Countrycode = 'JPN';
````