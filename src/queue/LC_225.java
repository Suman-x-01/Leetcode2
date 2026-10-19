package queue;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class LC_225 {
    Queue<Integer> queue=new LinkedList<>();
    public LC_225() {

    }

    public void push(int x) {
        queue.offer(x);

        int size=queue.size();
        for(int i=0;i<size-1;i++){
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();

    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
    static void main() {

    }

}
