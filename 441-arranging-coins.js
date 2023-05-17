/**
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
*/

/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {
    return Math.floor((Math.sqrt(8*n+1)-1)/2)
};
