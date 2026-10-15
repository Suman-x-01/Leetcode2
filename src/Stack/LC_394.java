package Stack;

import java.util.Stack;

public class LC_394 {
    static void main() {
        System.out.println(decodeString("3[e2[i]]"));
    }
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
//            convert into int if the char is a number
            if (Character.isDigit(s.charAt(i))){
                k=k*10+(s.charAt(i)-'0');
            }
            else if(s.charAt(i)=='['){
                countStack.push(k);
                stringStack.push(current.toString());

                k=0;
                current=new StringBuilder();


            }else if (s.charAt(i) == ']'){
                int count=countStack.pop();
                String prevStr=stringStack.pop();
                StringBuilder builder=new StringBuilder();
                for (int j = 0; j < count; j++) {
                    builder.append(current);
                }
                current=new StringBuilder(prevStr).append(builder);

            }else{
                current.append(s.charAt(i));

            }

        }
        return current.toString();

    }
}
