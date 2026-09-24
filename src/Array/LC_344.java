package Array;

public class LC_344 {
    static void main() {
        reverseString(new char[]{'h','e','l','l','o'});

    }
    public static void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;r--;
        }
        for(char c:s){
            System.out.println(c);
        }
    }
}
