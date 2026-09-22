package Array;

import java.util.Arrays;

public class LC_410 {
    static void main() {
        System.out.println(splitArray(new int[]{7,2,5,10,8},2));
    }
    public static int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right=Arrays.stream(nums).sum();
        while(left<right){
            int mid=(left+right)/2;
            int res=check(nums,mid);
            if (res>k){
                left=mid+1;
            }else{
                right=mid;
            }
        }

    return left;
    }
    public static int check(int[]nums,int mid){
        int count=1,total=0;
        for(int i:nums){
            if (total+i>mid){
                count++;
                total=i;

            }else{
                total+=i;
            }

        }
        return count;
    }

}
