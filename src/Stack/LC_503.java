package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LC_503 {
    static void main() {

    }
    public static int[] nextGreaterElements(int[] nums) {
        int []arr=new int[nums.length];
        Stack<Integer>stack=new Stack<>();
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length*2;i++){
            int idx=i%nums.length;
            while(!stack.isEmpty() && nums[stack.peek()]<nums[idx]){
                arr[stack.pop()]=nums[idx];
            }

            if(i<nums.length){
                stack.push(idx);
            }
        }
        return arr;

    }
}
