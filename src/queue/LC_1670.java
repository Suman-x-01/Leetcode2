package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class LC_1670 {

    Deque<Integer>dq=new ArrayDeque<>();
        public LC_1670() {

        }

        public void pushFront(int val) {
            dq.addFirst(val);
        }

        public void pushMiddle(int val) {
            int mid=dq.size()/2;

            ArrayList<Integer>al=new ArrayList<>(dq);
            al.add(mid, val);
            dq.clear();
            dq.addAll(al);
        }

        public void pushBack(int val) {
            dq.addLast(val);

        }

        public int popFront() {
            return dq.isEmpty()? -1: dq.pop();
        }

        public int popMiddle() {
            if (dq.isEmpty()) {
                return -1;
            }


            int mid=dq.size()/2;

            ArrayList<Integer>al=new ArrayList<>(dq);
            int res=al.remove(mid);
            dq.clear();
            dq.addAll(al);
            return res;
        }

        public int popBack() {
            if (dq.isEmpty()) {
                return -1;
            }

            return dq.removeLast();
        }


/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
}
