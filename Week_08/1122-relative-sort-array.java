class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i : arr1) {
            count[i]++;
        }
        int j = 0;
        for(int i : arr2) {
            for (; count[i] > 0; j++,count[i]--) {
                arr1[j] = i;
            }
        }
        for (int i = 0; i < 1001; ++i) {
            for (; count[i] > 0; ++j,count[i]--) {
                arr1[j] = i;
            }
        }
        return arr1;
    }
}