package Array;

import java.util.HashMap;
import java.util.Map;

public class LC_525 {
    static void main() {
        System.out.println(findMaxLength(new int[]{0,1,1,0,0}));
    }
    public static int findMaxLength(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int prefix=0, maxLength=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                prefix-=1;
            }else{
                prefix+=1;
            }

            if(map.containsKey(prefix)){
                int length=i-map.get(prefix);
                maxLength=Math.max(maxLength,length);
            }else{
                map.put(prefix,i);
            }
        }
        return maxLength;
    }
}
