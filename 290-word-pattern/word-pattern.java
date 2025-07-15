class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> smap = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (patternMap.containsKey(c)) {
                String mappedWord = patternMap.get(c);
                if (!mappedWord.equals(w)) {
                    return false; 
                }
            }
            if (!smap.getOrDefault(w, c).equals(c)) {
                return false;
            }

            patternMap.put(c, w);
            smap.put(w, c);
        }
        return true;
    }
}