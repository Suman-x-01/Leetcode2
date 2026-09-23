package Array;

public class LC_125 {
    static void main() {
        System.out.println(isPalindrome("121"));
    }
    public static boolean isPalindrome(String s) {
        String str=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int p=0,q=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(p)!=str.charAt(q)){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}
