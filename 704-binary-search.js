/*
    1. Create two pointers ( left and right)
    2. Create midway poiner(mid) (add left and right and divide by 2)
    3. If mid is < target,  shift left (left = mid + 1)
    4. If mid is > target, shift right ( right = mid - 1);
    5. Otherwise, return -1
*/

var search = function (nums, target) {

    let [left, right] = [0, (nums.length - 1)];

    while( left <= right ) {
        const mid = (left + right) >> 1 ;
        const guess = nums[mid];

        const isTarget = guess === target;
        if(isTarget) return mid;

        const isTargetGreater = guess < target;
        if(isTargetGreater) left = mid + 1;

        const isTargetLess = target < guess;
        if(isTargetLess) right = mid - 1;
    }

    return -1;
};