/**
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
*/

/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
    const rows = [
        "qwertyuiop",
        "asdfghjkl",
        "zxcvbnm"
    ]

    return words.filter(word => {
        word = word.toLowerCase()
        let n

        if (rows[0].split('').find(l => l == word[0])) {
            n = 0
        } else if (rows[1].split('').find(l => l == word[0])) {
            n = 1
        } else {
            n = 2
        }

        for (let i = 0; i < word.length; i++) {
            if (!rows[n].split('').find(l => l == word[i])) {
                return false
            }
        }
        return true
    });
}
