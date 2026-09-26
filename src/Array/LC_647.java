package Array;

public class LC_647 {
    static void main() {
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        int n=s.length();
        int palindromeCount=0;
        for(int i=0;i<n;i++){
            int odd=1+validPalindrome(i-1,i+1,s);
            int even=validPalindrome(i,i+1,s);
            palindromeCount+=(even+odd);
        }
        return palindromeCount;
    }
    static int validPalindrome(int l, int r, String s){
        int count=0;
        while(l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            }else{
                break;
            }
        }
        return count;
    }
}
