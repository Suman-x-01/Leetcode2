package gfg;

public class LongestSubstringWithKUnique {

    public int longestKSubstr(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int distinct = 0;
        int max = -1;

        for (int right = 0; right < s.length(); right++) {

            // Add right character
            if (freq[s.charAt(right) - 'a'] == 0) {
                distinct++;
            }

            freq[s.charAt(right) - 'a']++;

            // Too many distinct characters
            while (distinct > k) {
                freq[s.charAt(left) - 'a']--;

                if (freq[s.charAt(left) - 'a'] == 0) {
                    distinct--;
                }

                left++;
            }

            // Exactly k distinct characters
            if (distinct == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}