/**
 * 
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
 */

var mySqrt = function(x) {
    let sqrt = 1;
    if(x === 0) return 0;
    for(let i = 1; i*i <= x; i++) {
        sqrt = i;
    }
    return sqrt;
};
