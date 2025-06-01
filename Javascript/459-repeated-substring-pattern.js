/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
 */

/**
 * @param {string} s
 * @return {boolean}
 */
var repeatedSubstringPattern = function(s) {
    
    let size = s.length;
    let sFold = s.substr(1, size) + s.substr(0, size-1);
    
    return sFold.indexOf( s ) != -1;
};
