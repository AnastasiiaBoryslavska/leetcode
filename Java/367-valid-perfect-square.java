/**
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */

public class Solution {
    public boolean isPerfectSquare(int num) {

     if(num == 1)
        return true;

        long low = 1,
            high = num / 2,
            mid = 0;

        long nums = (long)num;

        while(low <= high) {
            mid = low + (high - low) / 2;

            if((mid * mid) == nums)
                return true;
            else if( (mid * mid) < nums)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
