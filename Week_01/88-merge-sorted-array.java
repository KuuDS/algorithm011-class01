/**
 * Tips: 双指针, 从无冲突部分开始处理.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i =  m + n - 1;
        int j = m - 1;
        int k = n - 1;
        while(k >= 0 && j >= 0) {
            if (nums1[j] >= nums2[k]) {
                nums1[i--] = nums1[j--];
            } else {
                nums1[i--] = nums2[k--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, k+1);
    }
}