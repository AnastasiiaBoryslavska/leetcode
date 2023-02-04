class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //check if concatenated strings are equasl, if not return ""
        if( !(str1+str2).equals(str2+str1) ) return "";

        //if equal, return the substring from 0 to gcd of size(str1), size(str2)

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}