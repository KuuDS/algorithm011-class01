/**
 * Tips: 双指针
 */
class Solution {
    public void moveZeroes(int[] nums) {

        for ( int i = 0,j = 0; i < nums.length; ++i ) {
            if (nums[i] != 0) {
                if ( i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }

    }
}