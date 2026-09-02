package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_128 {
    public static int LongestSequence(int []arr){
        Set<Integer>s=new HashSet<>();
        Map<Integer,Integer>m=new HashMap<>();

//        put all element into set to check if the element is  present in the array or not using contains ,method
        for (int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        int maxLen=0;

//        check the sequence
        for(int i=0;i<arr.length;i++){
            int count=0;
            int value=arr[i];
            if(m.containsKey(value)){
                continue;
            }
            while(s.contains(value)){
                if(m.containsKey(value)){
                    int length=m.get(value);
                    count+=length;
                    break;
                }
                count++;
                m.put(value,0);
                value++;
            }
            m.put(arr[i],count);
            maxLen=Math.max(maxLen,count);

        }

        return  maxLen;

    }
    static void main(String[] args) {
        int []arr={3,99,1,2,5};
        int res=LongestSequence(arr);
        System.out.println(res);
    }
}
