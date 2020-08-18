class Solution {
    public boolean isAnagram(String s, String t) {
        int[] dict = new int[26];
        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            dict[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            int index = ch - 'a';
            if (dict[index] > 0) {
                dict[index]--;
            } else {
                return false;
            }
        }
        return true;

    }
}