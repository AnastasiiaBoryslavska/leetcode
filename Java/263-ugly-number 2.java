/**
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
 */

 class Solution {
    public boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++) {
          while (n % i == 0) {
           n /= i;
          }
        }
       return n == 1;
    }
}
