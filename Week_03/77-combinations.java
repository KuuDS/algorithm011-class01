class Solution {

    private List<List<Integer>> combine = null;
    private int k;
    private int n;

    private void backTrack(int depth, LinkedList<Integer> sorted) {
        if(sorted.size() == k) {
            combine.add(new LinkedList<>(sorted));
            return;
        }
        for (int i = depth; i < n + 1; ++i) {
            sorted.add(i);
            backTrack(i + 1, sorted);
            sorted.removeLast();
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        combine = new LinkedList<>();
        this.n = n;
        this.k = k;
        backTrack(1, new LinkedList<>());
        return combine;
    }
}