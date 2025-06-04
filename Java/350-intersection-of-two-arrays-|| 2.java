/**
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */

 class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i : nums1){
             int freq = map.getOrDefault(i, 0);
             map.put(i, freq + 1);
         }
         ArrayList<Integer> list = new ArrayList<>();
         for(int i : nums2){
             if(map.get(i) != null && map.get(i) > 0){
                 list.add(i);
                 map.put(i, map.get(i) - 1);
             }
         }
         int[] ret = new int[list.size()]; 
         for(int i = 0; i < list.size();i++){
             ret[i] = list.get(i);
         }
         return ret;
     }
 }
 