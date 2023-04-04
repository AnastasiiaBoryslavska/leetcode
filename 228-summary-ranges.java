/**
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
*/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        boolean isSequence = false;
        for (int i = 0; i < nums.length; i++) {

            if (sb.length() == 0) {
                sb.append(nums[i]);
            }

            if (i != nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                isSequence = true;
            } else {
                if (isSequence) {
                    sb.append("->").append(nums[i]);
                }
                list.add(sb.toString());
                sb = new StringBuilder();
                isSequence = false;
            }
        }    
        return list;
    }
}