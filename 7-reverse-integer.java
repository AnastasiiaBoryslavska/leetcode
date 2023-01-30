/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

 class Solution {
    public static int reverse(int x) {
        int answer = 0;
        int lastDigit;

        while(x != 0) {
            lastDigit = x % 10;
            x = x / 10;

            if(answer > Integer.MAX_VALUE / 10 || answer == Integer.MAX_VALUE / 10 && lastDigit > 7) {
                return 0;
            }
            if(answer < Integer.MIN_VALUE / 10 || answer == Integer.MIN_VALUE / 10 && lastDigit < -8) {
                return 0;
            }

            answer = (answer * 10) + lastDigit;
        }
        return answer;
    }
 }