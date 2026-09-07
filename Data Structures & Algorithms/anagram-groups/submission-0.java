class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagram = new HashMap<>();
        for( String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            anagram.putIfAbsent(key, new ArrayList<>() );
            anagram.get(key).add(str);

        }

        return new ArrayList<>(anagram.values());
        
    }
}
