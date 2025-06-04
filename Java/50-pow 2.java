/**
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000 
*/

class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            return 1/x * myPow(1/x, -(n + 1));
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}
