# [Weather Observation Station 3](https://www.hackerrank.com/challenges/weather-observation-station-3/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Query a list of **CITY** names from **STATION** for cities that have an even **ID** number. Print the results in any order, but exclude duplicates from the answer.

The **STATION** table is described as follows:

![Station.png](attachments%2FStation.png)

where **LAT_N** is the northern latitude and **LONG_W** is the western longitude.

# Solution
````mysql
SELECT Distinct City
FROM Station
WHERE mod(ID, 2) = 0;
````