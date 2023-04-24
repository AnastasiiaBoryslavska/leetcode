/**
 Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */


var sortColors = function(nums) { //One Pass-  Dutch National Flag Algorithm, Time - O(N), Space - O(1)
    // for all idx < p0 : nums[idx < p0] = 0   // for all idx > p2 : nums[idx > p2] = 2

    let p0 = 0;  // p0 tracks the righmost boundary of 0;
    let curr = 0;  // curr  tracks current element under consideration
    let p2 = nums.length - 1; // p2 tracks the leftmost boundary of 2s

    let tmp;
    while (curr <= p2) {
        if (nums[curr] == 0) { // if nums[curr] == 0, swap p0-th and curr-th elements and move both to right(increase)
            tmp = nums[p0];
            nums[p0] = nums[curr];
            nums[curr] = tmp;
            p0++;;
            curr++;
         }
        else if (nums[curr] == 2) {   // if nums[curr] == 2, swap p2-th and curr-th elements, move p2 to left (decrease)
            tmp = nums[curr];
            nums[curr] = nums[p2];
            nums[p2] = tmp;
            p2--;
        }
        else curr++;
    }
};
