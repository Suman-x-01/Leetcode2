package Array;

public class LC_290 {
    static void main() {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");

        if(pattern.length()!=words.length) return false;
        for(int i=0;i<pattern.length();i++){
            if(patternIndex(pattern,pattern.charAt(i))!=wordIndex(words,words[i])){
                return false;
            }
        }
        return true;
    }

    private static int wordIndex(String[] words, String word) {
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(word)) return i;
        }
        return -1;
    }

    private static int patternIndex(String pattern, char c) {
        for (int i = 0; i < pattern.length(); i++) {
            if(pattern.charAt(i)==c) return i;
        }
        return -1;
    }

}
