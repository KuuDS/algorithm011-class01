class Solution {
    public void rotate(int[] nums, int k) {
        final int size = nums.length;
        // k取余
        k = k % size;
        // 翻转整个数组
        reverse(nums, 0, size - 1 );
        // 翻转前K个元素 [0, k-1]
        reverse(nums, 0, k - 1);
        // 翻转后size-k个元素  [k, size-1]
        reverse(nums, k, size -1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}