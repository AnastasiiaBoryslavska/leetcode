/**
You are given an alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

Return the reformatted string or return an empty string if it is impossible to reformat the string.

Example 1:

Input: s = "a0b1c2"
Output: "0a1b2c"
Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
*/

class Solution {
    public String reformat(String s) {
        if (s == null || s.length() == 0) return "";
        int ds = 0, as = 0;
        char[] arr = s.toCharArray(), res = new char[s.length()];
        for (char c : arr) {
            if (Character.isDigit(c)) ds++;
            else if (Character.isLetter(c)) as++;
            else return "";
        }
        if (Math.abs(as - ds) > 1) return "";
        boolean isDigit = ds >= as;
        for (int i = 0, d = 0, a = 0; i < arr.length; i++) {
            if (isDigit) {
                while (!Character.isDigit(arr[d])) d++;
                res[i] = arr[d++];
            } else {
                while (!Character.isLetter(arr[a])) a++;
                res[i] = arr[a++];
            } 
            isDigit = !isDigit;
        }
        return String.valueOf(res);
    }
}
