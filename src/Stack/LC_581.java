package Stack;

import java.util.Arrays;

public class LC_581 {
    static void main() {
        System.out.println(findUnsortedSubarray(new int[]{2,7,2,9,4,6,5,20}));
    }

    public static int findUnsortedSubarray(int[] nums) {
        int []arr=nums.clone();
        Arrays.sort(arr);

        int left=0; int right=arr.length-1;

        while(left<arr.length && arr[left]==nums[left]){
            left++;
        }
        if(left==arr.length) return 0;

        while(right>0 && arr[right]==nums[right]){
            right--;
        }

        return right-left+1;
    }
}
