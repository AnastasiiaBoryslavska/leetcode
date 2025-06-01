/* Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false 
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        long i = 1;
        while (i < n) {
            i *= 4;
        }
        return i == n;
    }
}
