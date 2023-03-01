# [Java 1D Array (Part 2)](https://www.hackerrank.com/challenges/java-1d-array/problem)

**Difficulty:** medium
</br>**Points:** 25
</br>**Skill:** Java (Basic)

Let's play a game on an array! You're standing at index _0_ of an _n_-element array named _game_. From some index _i_ (where _0 <= i < n_), you can perform one of the following moves:
- Move Backward: If cell _i-1_ exists and contains a _0_, you can walk back to cell _i-1_.
- Move Forward:
  - If cell _i+1_ contains a zero, you can walk to cell _i+1_.
  - If cell _i+leap_ contains a zero, you can jump to cell _i+lead_.
  - If you're standing in cell _n-1_ or the value of _i+leap >= n_, you can walk or jump off the end of the array and win the game.

In other words, you can move from index _i_ to index _i+1_, _i-1_, or _i+leap_ as long as the destination index is a cell containing a _0_. If the destination index is greater than _n-1_, you win the game.

## Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:
- int leap: the size of the leap
- int game[n]: the array to traverse

## Returns
- boolean: true if the game can be won, otherwise false

## Input Format

The first line contains an integer, _q_, denoting the number of queries (i.e., function calls).
The _2*q_ subsequent lines describe each query over two lines:
1. The first line contains two space-separated integers describing the respective values of _n_ and _leap_.
2. The second line contains _n_ space-separated binary integers (i.e., zeroes and ones) describing the respective values of _game<sub>0</sub>, game<sub>1</sub>, ..., game<sub>n-1</sub>.

## Constraints
- 1 <= q <= 5000
- 2 <= n <= 100
- 0 <= leap <= 100
- It is guaranteed that the value of _game[0]_ is always _0_.

## Sample Input
````java
STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
````

## Sample Output
````java
YES
YES
NO
NO
````

## Explanation

We perform the following _q=4_ queries:
1. For _game = [0,0,0,0,0]_ and _leap = 3_, we can walk and/or jump to the end of the array because every cell contains a _0_. Because we can win, we return true.
2. For _game = [0,0,0,1,1,1]_ and _leap = 5_, we can walk to index _1_ and then jump _i+leap = 1+5 = 6_ units to the end of the array. Because we can win, we return true.
3. For _game = [0,0,1,1,1,0]_ and _leap = 3_, there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
4. For _game = [0,1,0]_ and _leap = 1_, there is no way for us to get past the one at index _1_. Because we cannot win, we return false.