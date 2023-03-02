# [Weather Observation Station 1](https://www.hackerrank.com/challenges/weather-observation-station-1/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** SQL (Basic)

# Problem
Query a list of **CITY** and **STATE** from the **STATION** table.
The **STATION** table is described as follows:

![img.png](attachments/Station.png)

where **LAT_N** is the northern latitude and **LONG_W** is the western longitude.

# Solution
````mysql
SELECT City, State 
FROM Station;
````