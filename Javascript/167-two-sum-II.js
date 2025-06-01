/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */

//1. Create two pointers (start, end)
//2. Iterate through loop (while)
//3. Create variable to store the current sum
//4. check in loop if current sum is less than target
//4.1 if so -> move start pointer +1
//4.2 if bigger -> move end pointer -1
//5. return indices in an array (NOT 0 based)

var twoSum = function (numbers, target) {
    let start = 0;
    let end = numbers.length - 1;

    while (start < end ) {
        let currentSum = numbers[start] + numbers[end];
        if (currentSum < target) {
            start++;
        } else if(currentSum > target) {
            end--;
        } else {
            return [start + 1, end + 1]
        }
    }
    return [];
};