// You are given a string s and an integer k.
// You can choose any character of the string and change it to any other uppercase English character. 
// You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get
// after performing the above operations.

// Example:
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.


class Solution {
    public int characterReplacement(String s, int k) { 
        int[] charArray = new int[26];
        int maxCount = 0, start = 0, maxSize = 0;

        for(int end = 0; end < s.length(); end++) {
            charArray[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, charArray[s.charAt(end) - 'A']);

            while(end - start + 1 - maxCount > k) {
                charArray[s.charAt(start) - 'A']--;
                start++;
            }
            maxSize = Math.max(maxSize, end - start + 1);
        }
        return maxSize;
    }
}
