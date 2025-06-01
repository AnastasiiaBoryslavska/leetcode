/**
Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:

0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0

Example 1:

Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
Output: 2
Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
*/

class Solution {
   public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
      Map<Integer, Integer> map = new HashMap<>();
    
      for(int i=0; i<C.length; i++) {
          for(int j=0; j<D.length; j++) {
              int sum = C[i] + D[j];
              map.put(sum, map.getOrDefault(sum, 0) + 1);
          }
      }
    
      int res=0;
      for(int i=0; i<A.length; i++) {
          for(int j=0; j<B.length; j++) {
              res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
          }
      }
    
      return res;
  }
}
