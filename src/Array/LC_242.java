package Array;

public class LC_242 {
    static void main() {
        System.out.println(isAnagram("anagram","aaagrmn"));
    }

        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] arr = new int[26];

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                char ch2 = t.charAt(i);

                arr[ch - 'a']++;
                arr[ch2 - 'a']--;
            }

            for (int i : arr) {
                if (i != 0) {
                    return false;
                }
            }

            return true;
        }

}
