package Stack;

import java.util.Stack;

public class LC_682 {
    static void main() {
        System.out.println(calPoints(new String[]{"2","4","+"}));
    }
    public static int calPoints(String[] operations) {
        Stack<String> stack=new Stack<>();
        for(String str:operations){
            if (str.equals("+")){
                if (stack.size()>=2){

                    int last=Integer.parseInt(stack.peek());
                    int secondLast=Integer.parseInt(stack.get(stack.size()-2));
                    stack.push(String.valueOf(last+secondLast));

                }}
                else if(str.equals("D")){
                    int value=Integer.parseInt(stack.peek());
                    stack.push(String.valueOf(value*2));
                }
                else if(str.equals("C")){
                    stack.pop();
                }else{
                    stack.push(str);

                }


        }

        int sum=0;
        while(!stack.isEmpty()){
            int num=Integer.parseInt(stack.pop());
            sum+=num;
        }
        return sum;
    }
}
