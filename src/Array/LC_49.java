package Array;

import java.util.*;

public class LC_49 {
    static void main() {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mp=new HashMap<>();
        for(String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sortedWord=new String(arr);
            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord,new ArrayList<>());
            }
            mp.get(sortedWord).add(word);
        }
        return new ArrayList<>(mp.values());
    }
    }
