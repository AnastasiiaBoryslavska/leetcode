//1. create for loop and itterate an input array
//2. check if itterating number is equal to the value
//3. remove the number from an array if its equal to the value
//4. return length of the array

function removeElement(nums, val) {
    if(!nums) return 0;
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] === val) {
            nums.splice(i, 1);
            i--
        }
    }
    return nums.length;
};


console.log(removeElement([2,3,4,4,5], 4));
