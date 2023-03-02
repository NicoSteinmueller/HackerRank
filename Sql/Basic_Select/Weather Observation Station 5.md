# [Weather Observation Station 5](https://www.hackerrank.com/challenges/weather-observation-station-5/problem)

**Difficulty:** easy
</br>**Points:** 30
</br>**Skill:** SQL (Basic)

# Problem
Query the two cities in **STATION** with the shortest and longest **CITY** names, as well as their respective lengths (i.e.: number of characters in the name). 
If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

The **STATION** table is described as follows:

![Station.png](attachments%2FStation.png)

where **LAT_N** is the northern latitude and **LONG_W** is the western longitude.

## Sample Input

For example, **CITY** has four entries: **DEF**, **ABC**, **PQRS** and **WXY**.

## Sample Output
````mysql
ABC 3
PQRS 4
````

## Explanation

When ordered alphabetically, the **CITY** names are listed as **ABC**, **DEF**, **PQRS**, and **WXY**, with lengths _3, 3, 4_
and _3_. The longest name is **PQRS**, but there are _3_ options for shortest named city. Choose **ABC**, because it comes first alphabetically.

## Note
You can write two separate queries to get the desired output. It need not be a single query.

# Solution
````mysql
(SELECT City, LENGTH(City)
FROM Station
ORDER BY LENGTH(City) desc, City desc
LIMIT 1)
UNION
(SELECT City, LENGTH(City)
FROM Station
ORDER BY LENGTH(City) asc, City asc 
LIMIT 1);
````