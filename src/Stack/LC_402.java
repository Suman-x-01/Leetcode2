package Stack;

import java.util.Stack;

public class LC_402 {
    static void main() {
        System.out.println(removeKdigits("10200",1));
    }
    public static String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char digit=num.charAt(i);
            while (!stack.isEmpty() && k>0 && stack.peek()>digit){
              stack.pop();
                k--;
            }
            stack.push(digit);
        }

//        remove if all the numbers are nott removed as size of k
        while (k>0){
            stack.pop();
            k--;
        }
//        we have to return into a form of string not individuals
        StringBuilder sb=new StringBuilder();

        for(char ch:stack){
            sb.append(ch);
        }

//        if any before 0 are there in the string
        int i=0;
        while (i<sb.length() && sb.charAt(i)=='0'){
            i++;
        }

        String str=sb.substring(i);

        return str.isEmpty() ? "0" : str;

    }
}
