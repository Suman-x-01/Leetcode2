package gfg;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    static void main() {
        System.out.println((calculateSpan(new int[]{100,80,90,120})));
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer>stack=new Stack<>();
        ArrayList<Integer>al=new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            int span;
            if (stack.isEmpty()){
                span=i+1;
            }else {
                span=i-stack.peek();
            }
            al.add(span);
            stack.push(i);
        }
        return al;
    }
}
