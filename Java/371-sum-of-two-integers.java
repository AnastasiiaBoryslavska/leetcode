class Solution {
    public int getSum(int a, int b) {
        while(b != 0) {  //b is a carry value ( in case 1 + 1), since XOR operator does not care about carry value
            int tmp = (a & b) << 1; // we want to store the original value of b before executing XOR operator
            a = a ^ b;  //XOR operator. These two operations are equivalent to adding one another
            b = tmp;  
        }
        return a;
    }
}