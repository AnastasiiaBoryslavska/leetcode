/*
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */
class Solution {
    public List<String> commonChars(String[] words) {
        //initialize an array of counts for each character
        int[] charCount = new int[26];
        Arrays.fill(charCount, Integer.MAX_VALUE);

        // iterate over each word in the input array
        for(String word : words) {
            // initialize an array of counts for each character in the current word
            int[] currCharCount = new int[26];
            for(char c : word.toCharArray()) {
                currCharCount[c - 'a']++;
             }
            // update the global charCount array to keep track of the minimum count for each character across all words
            for(int i = 0; i < 26; i++) {
                charCount[i] = Math.min(charCount[i], currCharCount[i]);
             }
            
            }
                // generate the result list by adding each character count times
            List<String> result = new ArrayList<>();
            for(int i = 0; i < 26; i++) {
                for(int j = 0; j < charCount[i]; j++) {
                    result.add(String.valueOf((char)('a' + i)));
            }
            
        }
        return result;
    }
}

