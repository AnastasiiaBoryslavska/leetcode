/**
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000 
*/

/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    if(n == 0) {
        return 1;
    }
    if(n % 2 == 0) {
        return myPow(x * x, n / 2)
    }
    if(n == 1) {
        return x
    }
    if(n < 0) {
        return 1 / myPow(x, Math.abs(n))
    }
    return x * myPow(x, n - 1);
};
