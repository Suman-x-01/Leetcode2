package Array;

public class LC_31 {
    static void main() {
nextPermutation(new int[]{2,4,3,1});
    }
    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
//        find pivot
        while (i>=0&& nums[i]>=nums[i+1]){
            i--;
        }
//        find the just next large val then pivot
        if(i>=0){
            int j= nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
//            swap
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
//        right side sort
        int left=i+1;
        int right=nums.length-1;
        while (left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }

//        diplay
        for(int p:nums){
            System.out.print(p+" ");
        }
    }
    }
