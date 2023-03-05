# [Employee Salaries](https://www.hackerrank.com/challenges/salary-of-employees/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** SQL (Basic)

#Problem
Write a query that prints a list of employee names (i.e.: the name attribute) for employees in **Employee** 
having a salary greater than per month who have been employees for less than _$2000_ months. Sort your result by ascending employee_id.

## Input Format
The **Employee** table containing employee data for a company is described as follows:

![EmployeeFormat.png](attachments%2FEmployeeFormat.png)

where employee_id is an employee's ID number, name is their name, months is the total number of months they've been working for the company, and salary is the their monthly salary.

## Sample Input
![EmployeeInput.png](attachments%2FEmployeeInput.png)

## Sample Output
````mysql
Angela
Michael
Todd
Joe
````

## Explanation

Angela has been an employee for _1_ month and earns _$3443_ per month.

Michael has been an employee for _6_ months and earns _$2017_ per month.

Todd has been an employee for _5_ months and earns _$3396_ per month.

Joe has been an employee for _9_ months and earns _$3573_ per month.

We order our output by ascending employee_id.

# Solution
````mysql
SELECT name
FROM Employee
WHERE salary > 2000 AND months <10
ORDER BY employee_id;
````