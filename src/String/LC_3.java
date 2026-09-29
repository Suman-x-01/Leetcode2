package String;

import java.util.HashSet;
import java.util.Set;

public class LC_3 {
    static void main() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        // int count=0;
        // int max=0;
        // if(s.length()==1) return 1;
        // for(int i=0;i<s.length();i++){
        //     Map<Character,Integer>mp=new HashMap<>();
        //     for(int j=i;j<s.length();j++){
        //         if(!mp.containsKey(s.charAt(j))){
        //             mp.put(s.charAt(j),1);
        //             count++;
        //         }
        //         else{
        //             max=Math.max(count,max);
        //             break;

        //         }
        //     }
        //     max=Math.max(count,max);

        //     count=0;
        // }
        // return max;



        int left=0;int max=0;
        Set<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max, (right-left+1));
        }
        return max;

    }
}
