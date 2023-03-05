/**
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

 */

var dailyTemperatures = function(temperatures) {
    let res = Array.from({length: temperatures.length}, x=>0);
    let stack = [];
    for(let i = 0; i < temperatures.length; i++) {
        while(stack.length > 0 && temperatures[stack[stack.length - 1]] < temperatures[i]) {
            let j = stack.pop();
            res[j] = i - j;
        }
        stack.push(i);
    }
    return res;
};
