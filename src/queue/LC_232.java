package queue;


import java.util.Stack;

public class LC_232 {


        Stack<Integer>input=new Stack<>();
        Stack<Integer> output=new Stack<>();


        public LC_232() {

        }

        public void push(int x) {
            input.push(x);
        }


        public int pop() {
            moveElements();
            return output.pop();

        }

        public int peek() {
            moveElements();
            return output.peek();

        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
        public void moveElements(){
            if(output.isEmpty()){
                while(!input.isEmpty()){
                    output.push(input.pop());
                }
            }
        }


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
