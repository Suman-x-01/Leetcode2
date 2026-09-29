package String;

public class LC_76 {
    static void main() {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public  static String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";

        int []arr=new int[128];

        for(char ch:t.toCharArray()){
            arr[ch]++;
        }

        int required=0;

        for(int count:arr){
            if(count>0){
                required++;
            }
        }

        int left=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;
        int formed=0;
        for (int right = 0; right < s.length(); right++) {
            char ch=s.charAt(right);
            arr[ch]--;
            if(arr[ch]==0) formed++;

            while (formed==required){
                int windowLength=right-left+1;
                if (windowLength<minLength){
                    minLength=windowLength;
                    start=left;
                }

                char leftChar=s.charAt(left);
                arr[leftChar]++;
                if(arr[leftChar]>0){
                    formed--;
                }
                left++;


            }
        }
        if(minLength==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLength);

    }
    }
