class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>(strs.length);
        for (String s : strs) {
            String sorted = String.sort(
            if (dict.containsKey(score)) {
                dict.get(score).add(s);
            } else {
                List<String> anagrams = new ArrayList<>(strs.length);
                anagrams.add(s);
                dict.put(score, anagrams);
            }
        }
        final List<List<String>> group = new ArrayList<>(dict.values().size());
        dict.forEach((k,v)->{
            group.add(v);
        });
        return group;
    }
}