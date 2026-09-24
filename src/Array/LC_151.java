package Array;

public class LC_151 {
    static void main() {
        System.out.println(reverseWords(" Sky  is the blue "));
    }
    public static String reverseWords(String s) {
        String p = s.strip();
        int i = p.length() - 1;
        String n = "";
        int end = p.length();
        while (i >= 0) {
            if (p.charAt(i) != ' ') {
                i--;
            } else {
                n=n.concat(p.substring(i+1,end));
                n=n.concat(" ");
                while(i>=0 && p.charAt(i)==' '){
                    i--;
                }
                end=i+1;
            }

        }
        n=n.concat(p.substring(0,end));
        return n;
    }
}
