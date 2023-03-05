# [Weather Observation Station 6](https://www.hackerrank.com/challenges/weather-observation-station-6/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query the list of CITY names starting with vowels (i.e., _a_, _e_, _i_, _o_, or _u_) from STATION. Your result cannot contain duplicates.

## Input Format

The STATION table is described as follows:
![Station.png](attachments%2FStation.png)

where LAT_N is the northern latitude and LONG_W is the western longitude.

# Solution
````mysql
SELECT City
FROM Station
WHERE LOWER(LEFT(City, 1)) IN ('a','e','i','o','u');
````