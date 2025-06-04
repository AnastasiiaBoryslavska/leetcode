/**
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */


class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); //Google immutability string vs stringbuilder if you don't know why we use this instead of regular string
        int i = a.length() - 1, j = b.length() -1, carry = 0; //two pointers starting from the back, just think of adding two regular ints from you add from back
        while (i >= 0 || j >= 0) {
            int sum = carry; //if there is a carry from the last addition, add it to carry 
            if (j >= 0) sum += b.charAt(j--) - '0'; 
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            carry = sum / 2; //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }
}
