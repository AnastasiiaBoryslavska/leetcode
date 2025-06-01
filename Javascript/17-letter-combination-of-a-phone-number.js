/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */
var letterCombinations = function(digits) {
    if(digits == null || digits.length === 0) return [];

    const map = {
        2: 'abc',
        3: 'def',
        4: 'ghi',
        5: 'jkl',
        6: 'mno',
        7: 'pqrs',
        8: 'tuv',
        9: 'wxyz',
    }

    const res = [];
    const go = (i, s) => {
        if(i == digits.length) {
            res.push(s);
            return;
        }

        for(const c of map[digits[i]]) {
            go(i + 1, s + c);
        }
    }

    go(0, '');
    return res;
}
