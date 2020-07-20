/**
 * <a herf="https://leetcode-cn.com/problems/assign-cookies/submissions/">
 *
 * 双指针
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // sort g
        Arrays.sort(g);
        Arrays.sort(s);
        //check g

        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < g.length && j < s.length) {
            // g > s then j++
            if ( g[i] <= s[j])  {
            // g <= s then g++ j++ sum++
                i++;
                sum++;
            }
            j++;
        }
        return sum;
    }
}