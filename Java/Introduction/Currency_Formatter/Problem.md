# [Java Currency Formatter](https://www.hackerrank.com/challenges/java-currency-formatter/problem)

**Difficulty:** easy
</br>**Points:** 15
</br>**Skill:** Java (Basic)

Given a [double-precision](https://en.wikipedia.org/wiki/Double-precision_floating-point_format) number, _payment_, denoting an amount of money, use the [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) class' [getCurrencyInstance](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-) method to convert _payment_ into the US, Indian, Chinese, and French currency formats. 
</br>Then print the formatted values as follows:
````java
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
````
where _formattedPayment_ is _payment_ formatted according to the appropriate [Locale](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)'s currency.

**Note**: India does not have a built-in Locale, so you must [construct one](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-) where the language is **en** (i.e., English).

## Input Format

A single double-precision number denoting _payment_.

## Constraints
0 <= payment <= 10<sup>9</sup>

## Output Format

On the first line, print _US: u_ where _u_ is _payment_ formatted for US currency.</br>
On the second line, print _India: i_ where _i_ is _payment_ formatted for Indian currency.</br>
On the third line, print _China: c_ where _c_ is _payment_ formatted for Chinese currency.</br>
On the fourth line, print _France: f_, where _f_ is _payment_ formatted for French currency.</br>

## Sample Input
````java
12324.134
````

## Sample Output
````java
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
````

## Explanation

Each line contains the value of _payment_ formatted according to the four countries' respective currencies.