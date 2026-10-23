package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC_1700 {
        public int countStudents(int[] students, int[] sandwiches) {
            Queue<Integer> q=new LinkedList<>();

            for(int i:students){
                q.offer(i);
            }

            int count=0;
            int i=0;
            while(!q.isEmpty() && count<q.size() ){
                if(q.peek()==sandwiches[i]){
                    q.poll();
                    i++;
                    count=0;
                }else{
                    q.offer(q.poll());
                    count++;
                }
            }
            return q.size();
        }

}
