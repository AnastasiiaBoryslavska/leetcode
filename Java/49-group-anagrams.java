/*
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) { //base case
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>(); //create map to store the result
        for(String s : strs) {  //iterate over given array of strings
            char[] characters = new char[26];  //create array of characters , size of 26 represents number of characters in alphabet
            for(char c : s.toCharArray()) {  //iterate over each string in the given array of strings
                characters[c - 'a']++;  //count the occurrence of each character in a string
            }
            String keyStr = String.valueOf(characters);  //create  string using array of characters
            if(!map.containsKey(keyStr)) {  //check if map contains key with a newy created string
                map.put(keyStr, new ArrayList<>());  // if not -> add it to the map
            }
            map.get(keyStr).add(s); // if yes -> get the key and add string as a value
        } 
        return new ArrayList<>(map.values());  // return new Arraylist using values from map
    }
}
