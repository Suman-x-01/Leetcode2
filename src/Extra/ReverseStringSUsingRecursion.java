package Extra;

public class ReverseStringSUsingRecursion {
    static void main() {
        reverseString("Suman",-1);
    }

    static void  reverseString(String str, int length){
//        breaking condition/ base case
        if (length==str.length()-1) return;
        reverseString(str,length+1);
        System.out.println(str.charAt(length+1));
    }
}
