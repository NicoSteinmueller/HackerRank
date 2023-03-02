# [Weather Observation Station 4](https://www.hackerrank.com/challenges/weather-observation-station-4/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

# Problem
Find the difference between the total number of **CITY** entries in the table and the number of distinct **CITY** entries in the table.
The **STATION** table is described as follows:

![Station.png](attachments%2FStation.png)

where **LAT_N** is the northern latitude and **LONG_W** is the western longitude.

For example, if there are three records in the table with **CITY** values 'New York', 'New York', 'Bengalaru', there are 2 different city names: 'New York' and 'Bengalaru'. 
The query returns _1_, because _total number of records - number of unique city names = 3-2 = 1_.

# Solution
````mysql
SELECT COUNT(ID)-count(DISTINCT City)
FROM Station;
````