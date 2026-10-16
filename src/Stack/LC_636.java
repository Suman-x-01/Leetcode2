package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LC_636 {
    static void main() {
        System.out.println(
                Arrays.toString(
                        exclusiveTime(2, Arrays.asList(
                                "0:start:0",
                                "1:start:2",
                                "1:end:5",
                                "0:end:6"
                        ))
                )
        );
    }
    public static int[] exclusiveTime(int n, List<String> logs) {
        int []res=new int[n];
        Stack<Integer> stack=new Stack<>();
        int prevTime=0;

        for(String str:logs){
            String[]arr=str.split(":");
            int id=Integer.parseInt(arr[0]);
            String val=arr[1];
            int time=Integer.parseInt(arr[2]);

            if(val.equals("start")){
                if(!stack.isEmpty()){
                    res[stack.peek()]+=time-prevTime;

                }
                stack.push(id);
                prevTime=time;
            }else{

                res[stack.pop()]+=time-prevTime+1;
                prevTime=time+1;
            }

        }
        return res;
    }
}
