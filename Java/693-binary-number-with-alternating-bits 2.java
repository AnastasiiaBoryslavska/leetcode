/**
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
 */

 class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int a =(n&1);
            n>>=1;
            int b= (n&1);
            if(a==b)
                return false;
        }
        return true;
    }
}
