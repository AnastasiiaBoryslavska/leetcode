/* 
1. Create two pointers (left and right)
2. While left <= right check the conditions
3. Create one more pointer mid (pivot index)
4. If mid === target return mid
5. Check if left side is sorted or right side (if else)
6. Check if target is in the left , if yes, move right pointer , if in the right -> move left pointer
7. Return -1 if there is no target in the array
*/

var search = function (nums, target) {
    let left = 0;
    let right = nums.length - 1;

    while(left <= right) {
        let mid = Math.floor( (left + right) / 2 );
        if( nums[mid] === target) {
            return mid;
        }

        if( nums[left] <= nums[mid] ) {  //left side is sorted
            if (nums[left] <= target && target <= nums[mid]) {  //target is in the left
                right = mid - 1
            } else {  //target is in the right
                left = mid + 1
            }
        } else {  //right side is sorted
            if ( nums[mid] <= target && target <= nums[right] ) {  //target is in the right
                left = mid + 1
            } else {  // target is in the left
                right = mid - 1
            }
        }
    }
     
    return -1;  // target is not in the array
};