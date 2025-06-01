/**
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
*/

/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function(nums) {
    let i = 0, res = [];
    for (let j = 0; j < nums.length; j++) {
        if (nums[j+1] === nums[j] + 1) continue;
        else {
            if (i == j) res.push(nums[i] + "");
            else res.push( nums[i] + "->" + nums[j] );
            i = j + 1;
        }
    }
    return res;
}
