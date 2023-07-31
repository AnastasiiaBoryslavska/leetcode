/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:

Input: text = "nlaebolko"
Output: 1
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26]; //count all letters
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1];//for b
        min = Math.min(min, chars[0]);//for a
        min = Math.min(min, chars[11] / 2);// for l /2 
        min = Math.min(min, chars[14] / 2);//similarly for o/2
        min = Math.min(min, chars[13]);//for n
        return min;        
    }
}
