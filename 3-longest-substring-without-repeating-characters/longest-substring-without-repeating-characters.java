class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256]; 
        for (int i = 0; i < 256; i++) {
            hash[i] = -1; 
        }

        int n = s.length();
        int l = 0, r = 0;
        int maxLen = 0;

        while (r < n) {
            char c = s.charAt(r);
            if (hash[c] != -1 && hash[c] >= l) {
                l = hash[c] + 1;
            }

            hash[c] = r;

            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }
        return maxLen;
    }
}
