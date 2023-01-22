class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //sort the array
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            //skip equal elements to avoid dublicates at i;
            if(i - 1 >= 0 && nums[i] == nums[i - 1]) continue;

            //two pointers
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    //adding to result array
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //skip dublicates at left pointer
                    while(left + 1 < right && nums[left] == nums[left + 1])
                        left++;

                    //skip dublicates at right pointer
                    while(right - 1 > left && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;

                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}