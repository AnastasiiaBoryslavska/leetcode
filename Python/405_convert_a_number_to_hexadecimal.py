#Given a 32-bit integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
#All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.
#Note: You are not allowed to use any built-in library method to directly solve this problem.

#Example 1:

#Input: num = 26
#Output: "1a"

class Solution:
    def toHex(self, num):
        if num==0: return '0'
        mp = '0123456789abcdef'  # like a map
        ans = ''
        for i in range(8):
            n = num & 15       # this means num & 1111b
            c = mp[n]          # get the hex char 
            ans = c + ans
            num = num >> 4
        return ans.lstrip('0')  #strip leading zeroes
        