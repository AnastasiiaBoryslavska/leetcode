#The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
#P   A   H   N
#A P L S I I G
#Y   I   R
#And then read line by line: "PAHNAPLSIIGYIR"
#Write the code that will take a string and make this conversion given a number of rows:
#string convert(string s, int numRows);

#Example 1:

#Input: s = "PAYPALISHIRING", numRows = 3
#Output: "PAHNAPLSIIGYIR"

class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1 or numRows >= len(s):
            return s

        L = [''] * numRows
        index, step = 0, 1

        for x in s:
            L[index] += x
            if index == 0:
                step = 1
            elif index == numRows -1:
                step = -1
            index += step

        return ''.join(L)
    