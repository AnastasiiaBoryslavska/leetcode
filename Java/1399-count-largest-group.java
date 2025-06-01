/**
You are given an integer n.

Each number from 1 to n is grouped according to the sum of its digits.

Return the number of groups that have the largest size.

Example 1:

Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
There are 4 groups with largest size.
 */

 class Solution {
    public int countLargestGroup(int n) {
    int[] map = new int[37];
    int maxCount = 0, res = 0;
    for (int i = 1; i <= n; i++) {
      //get the sum of digits for current number
      int num = i, sum = 0;
      while (num > 0) {
        sum += num %10;
        num/=10;
      }
      //increment freq counter
      ++map[sum];
      //check if this is our new max = start counting from 1, if it next occurance of current max
      //increment count
      if (maxCount < map[sum]) {
        maxCount = map[sum];
        res = 1;
      } else if (maxCount == map[sum]) {
        res++;
      }
    }
    return res;
  }
}
