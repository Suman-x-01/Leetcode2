package Array;

import java.util.HashMap;
import java.util.Map;

public class LC_290 {
    static void main() {
        System.out.println(wordPattern("abba","dog cat rat dog"));
    }
//    public static boolean wordPattern(String pattern, String s) {
//        String[] words=s.split(" ");
//
//        if(pattern.length()!=words.length) return false;
//        for(int i=0;i<pattern.length();i++){
//            if(patternIndex(pattern,pattern.charAt(i))!=wordIndex(words,words[i])){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static int wordIndex(String[] words, String word) {
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].equals(word)) return i;
//        }
//        return -1;
//    }
//
//    private static int patternIndex(String pattern, char c) {
//        for (int i = 0; i < pattern.length(); i++) {
//            if(pattern.charAt(i)==c) return i;
//        }
//        return -1;
//    }
//============== =============== optimise approach ======================== =====================
public static boolean wordPattern(String pattern, String s) {
            String[] wordsArray=s.split(" ");
        if(pattern.length()!=wordsArray.length) return false;

    Map<String,Character>words=new HashMap<>();
    Map<Character,String>ptrn=new HashMap<>();

////    set values into map
//    for (int i=0;i<pattern.length();i++){
//        words.put(wordsArray[i],pattern.charAt(i));
//        ptrn.put(pattern.charAt(i),wordsArray[i]);
//    }

//   match

    for (int i=0;i<wordsArray.length;i++){
    char ch=pattern.charAt(i);
    String str=wordsArray[i];
        if (words.containsKey(str) && words.get(str)!=ch){
        return false;
        }
        if (ptrn.containsKey(ch) && !ptrn.get(ch).equals(str)){
            return false;
        }
//        if already not there in teh map then add
        ptrn.put(ch,str);
        words.put(str,ch);
    }
    return true;
}
}
