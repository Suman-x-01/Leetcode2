package Stack;

import java.util.Stack;

public class LC_150 {
    static void main() {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int first= stack.pop();
                int second= stack.pop();
                stack.push(first+second);
            } else if(tokens[i].equals("-")){
                int first= stack.pop();
                int second= stack.pop();
                stack.push(second-first);
            } else if(tokens[i].equals("*")){
                int first= stack.pop();
                int second= stack.pop();
                stack.push(first*second);
            } else if(tokens[i].equals("/")){
                int first= stack.pop();
                int second= stack.pop();
                stack.push(second/first);
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }        }
        return stack.pop();
    }


}
