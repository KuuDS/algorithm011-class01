class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }
        int sum = 0;
        int mask = 1;
        for (int i = 0; i < 32; ++i) {
            if ((mask & n) == mask) {
                if (sum > 0) {
                    return false;
                } else {
                    sum++;
                }
            }
            mask <<= 1;
        }
        return sum == 1;
    }
}