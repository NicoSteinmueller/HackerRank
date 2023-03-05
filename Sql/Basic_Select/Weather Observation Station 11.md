# [Weather Observation Station 11](https://www.hackerrank.com/challenges/weather-observation-station-11/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** SQL (Basic)

# Problem
Query the list of CITY names from **STATION** that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.

## Input Format

The **STATION** table is described as follows:
![Station.png](attachments%2FStation.png)

where LAT_N is the northern latitude and LONG_W is the western longitude.

# Solution
````mysql
SELECT DISTINCT City
FROM Station
WHERE LOWER(LEFT(City, 1)) NOT IN ('a','e','i','o','u') OR LOWER(RIGHT(City, 1)) NOT IN ('a','e','i','o','u');
````