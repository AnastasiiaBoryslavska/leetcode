/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * Example 1:
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 */

/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
const numJewelsInStones = (J, S) => {
    const jewels = new Set(J)
    return S.split('').reduce((res, s) => res + jewels.has(s), 0)
};
