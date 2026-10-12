package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LC_739 {
    static void main() {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
    public static int[] dailyTemperatures(int[] temperatures) {

//        i =0 1 2 3 4 5 6
//        stack =1 1 3 4 1
        Stack<Integer>stack=new Stack<>();
        int []arr=new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index=stack.pop();
                arr[index]=i-index;
            }
            stack.push(i);
        }
        return arr;
    }
    }
