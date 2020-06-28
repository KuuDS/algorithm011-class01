/**
 * Tips: Hash
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> minus = new HashMap<Integer, Integer>();
        for (int i = 0;  i < nums.length; ++i) {
            if (minus.containsKey(nums[i])) {
                result[0] = minus.get(nums[i]);
                result[1] = i;
                break;

            }
            minus.put(target - nums[i], i);
        }
        return result;

    }
}