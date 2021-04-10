# Anagram Generator

## Problem Description

Given a group of letters, print its anagrams.

### Sample Input

abc 

### Sample Output

abc; acb; bac; bca; cab; cba

## Solution Description

The code has been developing in Java. The static class _Anagram_ is responsible for generating all the anagrams of a given String value through the recursive method _getAllAnagrams(String, String)_. To avoid duplicated anagrams, we store the output in a _set_ object named _outputSet_. 

The method _printAnagrams_ of the main class _Solution_ calls the method named _getAllAnagrams(String, String)_ to generate all the anagrams of the input (object _letters_). In the end, this method prints the result (object _outputSet_) alphabetically ordered. 

Thank you for your time. :)
