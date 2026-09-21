package Array;

import java.util.HashMap;
import java.util.Map;

public class LC_560 {
    static void main() {
        System.out.println(subarraySum(new int[]{1,2,3},3));
    }
    public static int subarraySum(int[] nums, int k) {

//        broute-force approach
//        int count=0;
//        for (int i=0;i<nums.length;i++){
//            int sum=0;
//            for (int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                if(sum==k){
//                    count++;
//                }
//            }
//        }
//        return count;

        Map<Integer,Integer>map=new HashMap<>();
        int pre=0, count=0;
        map.put(0,1);
        for(int data:nums) {
            pre += data;
            if (map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
