class Solution {
    public int lengthOfLongestSubstring(String s) {
        //define pointers, maxLen, hashSet
        int l = 0, r = 0, maxLen = 0;
        HashSet<Character> hs = new HashSet<>();
        //check if character at r pointer exists in the hashSet, if not - add
        while(r < s.length()) {
            if(!hs.contains(s.charAt(r))) {
                hs.add(s.charAt(r));
                maxLen = Math.max(hs.size(), maxLen); //move pointer and update maxLen;
                r++;
            } else { //else remove repeating character at l pointer and move it
                hs.remove(s.charAt(l));
                l++;
            }
        }
        //return maxLen
        return maxLen;
    }
}