package HackerEarth;

import java.util.*;
public class PalindromePermutation {

        // abab
        public static void main(String[] args){
            solve("abab");
        }
        public static void solve(String s) {
            Map<Character,Integer>mp=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(mp.containsKey(ch)){
                    mp.put(ch, mp.get(ch)+1);

                }else{
                    mp.put(ch,1);
                }
            }

            int odd=0;
            for(int p:mp.values()){
                if(p%2!=0) odd++;
            }

            if(odd>1){
                System.out.println("NO");
            }else{
                System.out.println("YES");

            }
        }



}
