#A word is considered valid if:
#It contains a minimum of 3 characters.
#It contains only digits (0-9), and English letters (uppercase and lowercase).
#It includes at least one vowel.
#It includes at least one consonant.
#You are given a string word.
#Return true if word is valid, otherwise, return false.

#Notes:

#'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
#A consonant is an English letter that is not a vowel.

class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) < 3:
            return False

        vowels = 0
        consonants = 0
        vowel_set = "aeiouAEIOU"

        for c in s:
            if c.isalpha():
                if c in vowel_set:
                    vowels += 1
                else:
                    consonants += 1
            elif not c.isdigit():
                return False  # invalid character

        return vowels >= 1 and consonants >= 1
