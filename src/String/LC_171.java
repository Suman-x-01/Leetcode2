package String;

public class LC_171 {
    static void main() {
        System.out.println(titleToNumber("AA"));
    }
    public static int titleToNumber(String columnTitle) {
        int res=0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch=columnTitle.charAt(i);
            res=res*26+('A'-ch+1);
        }
return res;
    }
}
