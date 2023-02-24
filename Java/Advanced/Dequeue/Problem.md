# Java Dequeue

**Difficulty:** medium
</br>**Points:** 20
</br>**Skill:** Problem Solving (Intermediate)

In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:
````java
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
````

You can find more details about Deque [here](http://docs.oracle.com/javase/7/docs/api/java/util/Deque.html).

In this problem, you are given _N_ integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size _M_.

Note: Time limit is _3_ second for this problem.

## Input Format

The first line of input contains two integers _N_ and _M_: representing the total number of integers and the size of the subarray, respectively. The next line contains _N_ space separated integers.

## Constraints
- 1 <= N <= 100000
- 1 <= M <= 100000
- M <= N

The numbers in the array will range between _[0, 10.000.000]_.

## Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size _M_.

## Sample Input
````java
6 3
5 3 5 2 3 2
````

## Sample Output
````java
3
````

## Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

- _s1 = {5,3,5}_ - Has 2 unique numbers.

- _s2 = {3,5,2}_ - Has 3 unique numbers.

- _s3 = {5,2,3}_ - Has 3 unique numbers.

- _s4 = {2,3,2}_ - Has 2 unique numbers.

In these subarrays, there are _2,3,3,2_ unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is _3_.