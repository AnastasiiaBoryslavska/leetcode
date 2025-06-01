/**
 A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
*/

/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
var uncommonFromSentences = function(s1, s2) {
    const wordSet = new Set();
    const removed = new Set();
    const combined = `${s1} ${s2}`.split(" ");
    
    for (let word of combined) {
        if (wordSet.has(word) || removed.has(word)) {
            wordSet.delete(word);
            removed.add(word);
        } else {
            wordSet.add(word);
        }
    }
    return [...wordSet];
};
