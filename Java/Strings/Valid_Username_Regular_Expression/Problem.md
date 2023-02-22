# [Valid Username Regular Expression](https://www.hackerrank.com/challenges/valid-username-checker/problem)

**Difficulty:** easy
</br>**Points:** 20
</br>**Skill:** Java (Basic)

You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:
- The username consists of _8_ to _30_ characters inclusive. If the username consists of less than _8_ or greater than _30_ characters, then it is an invalid username.
- The username can only contain alphanumeric characters and underscores (___). Alphanumeric characters describe the character set consisting of lowercase characters _[a-z]_, uppercase characters _[A-Z]_, and digits _[0-9]_.
- The first character of the username must be an alphabetic character, i.e., either lowercase character _[a-z]_ or uppercase character _[A-Z]_.

For example:

Username|	Validity|
---|---|
Julia| INVALID; Username length < 8 characters|
Samantha| VALID|
Samantha_21| VALID|
1Samantha| INVALID; Username begins with non-alphabetic character|
Samantha?10_2A| INVALID; '?' character not allowed|

Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

## Input Format

The first line of input contains an integer , describing the total number of usernames. Each of the next _n_ lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

## Constraints
- _1 <= n <= 100_
- The username consists of any printable characters.

## Output Format

For each of the usernames, the locked stub code prints _Valid_ if the username is valid; otherwise _Invalid_ each on a new line.

## Sample Input 0
````java
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
````

## Sample Output 0
````java
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
````

## Explanation 0

Refer diagram in the challenge statement.