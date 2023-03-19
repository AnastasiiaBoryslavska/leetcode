/**
 * Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 */

var compress = function(chars) {
    if(!chars.length) return 0;
    let j = 0;
    let cur = chars[0];
    let counter = 0;
    for(let i = 0; i <= chars.length; i++) {
        if(chars[i] === cur) {
            counter++;
        } else {
            chars[j] = cur;
            if(counter > 1) {
                const s = counter.toString();
                for(let k = 0; k < s.length; k++) chars[++j] = s[k];
            }
            j++;
            cur = chars[i];
            counter = 1;
        }
    }
    return j;
};
