package Array;

import java.util.Arrays;

public class LC_34 {
    static void main() {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7)));
    }
        public static  int[] searchRange(int[] nums, int target) {
            int ans=-1;
            int start=0,end=nums.length-1;
            int []arr=new int[2];
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    ans=mid;
                    end=mid-1;
                }else if(nums[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            arr[0]=ans;
            int ans2=-1;
            int start2=0,end2=nums.length-1;
            while(start2<=end2){
                int mid=start2+(end2-start2)/2;
                if(nums[mid]==target){
                    ans2=mid;
                    start2=mid+1;
                }else if(nums[mid]>target){
                    end2=mid-1;
                }else{
                    start2=mid+1;
                }
            }
            arr[1]=ans2;

            return arr;
        }
    }

