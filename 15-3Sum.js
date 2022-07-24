//1.Edge case -> check if we have at least three numbers
//2.Sort the numbers in ascending order
//3. Itterate through loop
//4.`i` represents the "left" most number in our sorted set.
// once this number hits 0, there's no need to go further since
// positive numbers cannot sum to a negative number
//5. Check for repeats to skip the number
//6. `j` represents the "middle" element between `i` and `k`.
// we will increment this up through the array while `i` and `k`
// are anchored to their positions. we will decrement `k` for
// for each pass through the array, and finally increment `i`
// once `j` and `k` meet.
//7. `k` represents the "right" most element
//8. to summarize our setup, we have `i` that starts at the beginning,
// `k` that starts at the end, and `j` that races in between the two.
//
// note that `i` is controlled by our outer for-loop and will move the slowest.
// in the meantime, `j` and `k` will take turns inching towards each other depending
// on some logic we'll set up below. once they collide, `i` will be incremented up
// and we'll repeat the process.
//9. if we find the target sum, increment `j` and decrement `k` for
// other potential combos where `i` is the anchor
//10.this is important! we need to continue to increment `j` and decrement `k`
// as long as those values are duplicated. in other words, we wanna skip values
// we've already seen. otherwise, an input array of [-2,0,0,2,2] would result in
// [[-2,0,2], [-2,0,2]].
//
// (i'm not a fan of this part because we're doing a while loop as we're
// already inside of another while loop...)
//11. finally, we need to actually move `j` forward and `k` backward to the
// next unique elements. the previous while loops will not handle this.


var threeSum = function(nums) {
    const result = []

    if(nums.length < 3) return result;

    nums = nums.sort( (a, b) => a - b );

    let target = 0;
    for(let i = 0; i < nums.length - 2; i++) {
        if( nums[i] > target) break

        if(i > 0 && nums[i] === nums[i - 1]) continue

        let j = i + 1;
        let k = nums.length - 1;

        while(j < k){
            let sum = nums[i] + nums[j] + nums[k]
            
            if(sum === target) {
                result.push([ nums[i], nums[j], nums[k] ]);

                while(nums[j] === nums[j+1]) j++
                while(nums[k] === nums[k+1]) k--

                j++
                k--
            // if the sum is too small, increment `j` to get closer to the target
            } else if (sum < target) {
                j++
            //if the sum is too large, decrement `k` to get closer to the target
            } else k--
        }
    }
    return result;
}