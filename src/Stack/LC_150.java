package Stack;

import java.util.Stack;

public class LC_150 {
    static void main() {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(first + second);
                }
                case "-" -> {
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second - first);
                }
                case "*" -> {
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(first * second);
                }
                case "/" -> {
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second / first);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }


}
