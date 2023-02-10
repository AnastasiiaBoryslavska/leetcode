/* 
 Given a string s, find the first non-repeating character in it and return its index.
 If it does not exist, return -1.
 Example 1:

 Input: s = "leetcode"
 Output: 0
 Example 2:

 Input: s = "loveleetcode"
 Output: 2
*/

class Solution {
   public int firstUniqChar(String s) {
     int[] abc = new int[26];
     char[] arr = s.toCharArray();

     for(int c : arr) {
        abc[c - 'a']++;
     }

     for(int i = 0; i < arr.length; i++) {
        if(abc[arr[i] - 'a'] == 1) return i;
     }
     return -1;
   }  
}
