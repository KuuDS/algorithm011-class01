public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        for (int i = 0, mask = 1; i < 32; ++i, mask<<=1) {
            if ( (n & mask) == mask ) {
               sum++;
            }
       }
       return sum;
    }
}