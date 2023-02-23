# [Java Exception Handling (Try-catch)](https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem)

**Difficulty:** easy
</br>**Points:** 10
</br>**Skill:** Java (Basic)

Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers _x_ and _y_ as input, you have to compute _x/y_. If _x_ and _y_ are not _32_ bit signed integers or if _y_ is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

## Sample Input 0:
````java
10
3
````

## Sample Output 0:
````java
3
````

## Sample Input 1:
````java
10
Hello
````

## Sample Output 1:
````java
java.util.InputMismatchException
````

## Sample Input 2:
````java
10
0
````

## Sample Output 2:
````java
java.lang.ArithmeticException: / by zero
````

##  Sample Input 3:
````java
23.323
0
````

## Sample Output 3:
````java
java.util.InputMismatchException
````
