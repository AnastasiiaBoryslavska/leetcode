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

class Solution {
    // Maps each character to the row in the keyboard in which it occurs.
    private int[] map = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
    
    public String[] findWords(String[] words) {
    
        String[] w = new String[words.length];	// Store filtered words
        int index = 0;							// Where to insert the filtered words
        for (String s: words)					// for each word in words
            if (checkWord(s.toLowerCase()))		// convert it to lowercase and check if all char
                w[index++] = s;					// occurs in the same row, if it does, add it
        return Arrays.copyOfRange(w, 0, index);	// Simply return a copy of the array from 0
    }											// index
    
    private boolean checkWord(String word){		// Check if all chars in the word belong in the
        int row = map[word.charAt(0)-'a'];		// same row. Check first chars row
        for (char c: word.toCharArray()){		// For all the chars in the word
            if (map[c-'a'] != row)				// if that char belongs to a different row,
                return false;					// return false
        }
        return true;							// All chars in same row, return true.
    }
    }
    