/**
The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.

Note:

Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string.

Example 1:

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        int i = 0, j = 0,  len = num, count = 0;
        StringBuilder str = new StringBuilder();
        while(len != 0){
            str.append(len % 10);
            len /= 10;
        }
        String stri = str.reverse().toString();
        while(j < stri.length()){
            if(j - i + 1 < k)
                j++;
            else if(j - i + 1 == k){
                int n = Integer.parseInt(stri.substring(i, (j+1)));
                if(n != 0){
                    if(num % n == 0)
                        count++;
                }
                i++;
                j++;
            }
    }

        return count;
    }
}
