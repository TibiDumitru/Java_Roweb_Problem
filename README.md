# Java_Roweb_Problem

Write a program in your preferred language that given an array of integers A will find all the pairs of numbers that if subtracted will result in a specific given number M. For example for the array A={4,5,10,11,6} and the number M=-1 will return the following pairs: 0-1, 2-3, 1-4. This means that A[0]-A[1]=4-5=-1 A[2]-A[3]=10-11=-1 si A[1]-A[4]=5-6=-1. Please explain the space/time performance and other trade-offs.



My solution has O(n) time complexity - elements are added as keys in a hashmap (the values are the appearances of elements) and than for each value I verify if (element + M) is a valid key in the hashmap (check in O(1)) -> pair.
There is a trade-off! For gaining such a good time complexity, I used a data structure, a hashmap, so the space complexity is O(n).

There are other solutions, which are less efficient:

+ for in for (for each element check the difference with all other elements) -> O(n^2)
+ sort the array and for each element find the needed element in the array with binary search -> O(n*log(n))
