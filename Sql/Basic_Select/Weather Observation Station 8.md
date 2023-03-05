# [Weather Observation Station 8](https://www.hackerrank.com/challenges/weather-observation-station-8/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** SQL (Basic)

# Problem
Query the list of CITY names from **STATION** which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.

## Input Format

The **STATION** table is described as follows:
![Station.png](attachments%2FStation.png)

where LAT_N is the northern latitude and LONG_W is the western longitude.

# Solution
````mysql
SELECT DISTINCT City
FROM Station
WHERE LOWER(LEFT(City, 1)) IN ('a','e','i','o','u') AND LOWER(RIGHT(City, 1)) IN ('a','e','i','o','u');
````