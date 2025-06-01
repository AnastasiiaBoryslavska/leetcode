//1. Pass the array into a Set() (which removes dublicates)
//2. Compare its size to thr original array

var containsDublicate = function(nums) {
    return new Set(nums).size !== nums.length;
}
