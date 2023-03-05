# [Weather Observation Station 7](https://www.hackerrank.com/challenges/weather-observation-station-7/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query the list of CITY names ending with vowels (a, e, i, o, u) from **STATION**. Your result cannot contain duplicates.

## Input Format

The **STATION** table is described as follows:
![Station.png](attachments%2FStation.png)

where LAT_N is the northern latitude and LONG_W is the western longitude.

# Solution
````mysql
SELECT DISTINCT City
FROM Station
WHERE LOWER(RIGHT(City, 1)) IN ('a','e','i','o','u');
````