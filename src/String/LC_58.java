package String;

public class LC_58 {
    static void main() {
        System.out.println(lengthOfLastWord(" hello worlddd "));
    }
    public static int lengthOfLastWord(String s){
        String str=s.strip();
        int i=str.length()-1;
        while(i>=0 && str.charAt(i)!=' '){
            i--;

        }
        return (str.length()-1)-i;
    }
}
