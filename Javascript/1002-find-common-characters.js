/*
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */

var commonChars = function(words) {
    let result = [];

    for(letter of words[0]) {
        if(words.every(w => w.includes(letter))) {
            result.push(letter);
            words = words.map(w => w.replace(letter, ''));
        }
    }
    return result;
}
