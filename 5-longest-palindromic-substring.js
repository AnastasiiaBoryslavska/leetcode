/**
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
*/

/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let max = '';
    for(let i = 0; i < s.length; i++) {
        for(let j = 0; j < 2; j++) {
            let left = i;
            let right = i + j;
            while(s[left] && s[left] == s[right]) {
                left--;
                right++;
            }
            if((right - left - 1) > max.length) {
                max = s.substring(left + 1, right);
            } 
        }
    }
    return max;
};
