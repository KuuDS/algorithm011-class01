class Solution {
    public int[][] merge(int[][] intervals) {
        // 1 2 8 15
        // 3 6 10 18
        // 1 - 6   8 - 10 15-18
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        LinkedList<int[]> res = new LinkedList<>();
        res.add(intervals[0]);
        for(int i = 1; i < intervals.length; ++i) {
            int[] p = intervals[i];
            if(p[0] <= lastUp(res)) {
                res.peekLast()[1] = Math.max(p[1], res.peekLast()[1]);
            } else {
                res.add(p);
            }
        }
        int[][] res0 = new int[res.size()][2];
        return res.toArray(res0);
    }

    private void add(int down, int up, List<int[]> res) {
        int[] p = {down, up};
        res.add(p);
    }

    private int lastUp(Deque<int[]> res) {
        return res.peekLast()[1];
    }

    private int lastDown(Deque<int[]> res) {
        return res.peekLast()[0];
    }
}
