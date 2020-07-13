class Solution {

    private List<List<Integer>> permute = null;
    private int[] nums = null;
    private boolean[] used = null;

    public void backTrack(LinkedList<Integer> list){
        // stop condition
        if (list.size() == used.length) {
            this.permute.add(new LinkedList<>(list));
            return;
        }
        // loop
        for (int i = 0; i < used.length; ++i) {
            if (!used[i]) {
                used[i] = true;
                list.add(nums[i]);
                backTrack(list);
                list.removeLast();
                used[i] = false;
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        this.permute = new LinkedList<>();
        this.used = new boolean[nums.length];
        this.nums = nums;
        backTrack(new LinkedList<>());
        this.used = null;
        this.nums = null;
        return permute;
    }
}