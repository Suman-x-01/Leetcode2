package Array;

import java.util.Arrays;

public class LC_2616 {
    static void main() {
        int []arr = {10, 1, 2, 7, 1, 3};
//        1,1,2,3,7,10
        int p = 2;
        int i = minimizeMax(arr, p);
        System.out.println(i);
    }
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0, r=nums[nums.length-1]-nums[0];
        int ans=r;

        while(l<=r){
            int mid=(l+r)/2;
            int countPair=CountNoPair(nums,mid);
            if(countPair>=p){
                ans=mid;
                r=mid-1;

            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static int CountNoPair(int[]arr, int target){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i+1]-arr[i]<=target){
                count++;
                i++;
            }
        }
        return count;
    }

}
