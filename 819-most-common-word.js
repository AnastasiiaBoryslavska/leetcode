/**
 Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
*/

/**
 * @param {string} paragraph
 * @param {string[]} banned
 * @return {string}
 */

var mostCommonWord = function(paragraph, banned) {
    let most;
    const map = {};
    const words = paragraph.toLowerCase().split(/[ !?',;.]/);
    words.forEach(w => {
      if (w && !banned.includes(w)) {
        map[w] = (map[w] || 0) + 1;
        if (!most || map[w] > map[most]) most = w;
      }
    });
    return most;
  };
  