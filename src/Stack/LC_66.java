package Stack;

import java.util.Stack;

public class LC_66 {
    static void main() {
        System.out.println(isValid("))(("));
    }
    public static boolean isValid(String s) {
        if (s.length()<2) return false;
        Stack<Character>st=new Stack<>();
        for (char ch:s.toCharArray()){
            if (ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(st.isEmpty()) st.push(ch);
            else if ((ch==')' && st.pop()!='(' )||( ch=='}' && st.pop()!='{')  ||(ch==']' && st.pop()!='[') )
                return false;
        }
        return st.isEmpty();
    }
}
