/**
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */

var intersect = function(nums1, nums2) {
    obj = {};
    result = [];
    for(let i of nums1){
        obj[i] = obj[i] ? obj[i]+1 : 1
    }
    for(let i of nums2){
        if(obj[i]){
            obj[i]--
            result.push(i)
        }
    }
    return result
};
