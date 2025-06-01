/**
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
*/

/**
 * @param {number[]} nums
 * @return {number}
 */
var thirdMax = function(nums) {
    let firstMax = -Infinity
    let secondMax = -Infinity
    let thirdMax = -Infinity
    
    for(let n of nums){
      if(n === firstMax || n === secondMax || n === thirdMax) continue
      
      if(firstMax < n){     
        thirdMax = secondMax
        secondMax = firstMax 
        firstMax = n
      }else if(secondMax < n){
        thirdMax = secondMax       
        secondMax = n
      }else if(thirdMax < n){
        thirdMax = n
      }
    }
    if(thirdMax === -Infinity){
      return firstMax
    }else{
      return thirdMax
    }
  };
