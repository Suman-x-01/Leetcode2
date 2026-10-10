package Array;

import java.util.Arrays;

public class LC_283 {
    static void main() {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 0, 1, 4, 2})));
    }
        public static int[] moveZeroes(int[] nums) {
            int p=0;
            for(int i=0; i<nums.length;i++){
                if(nums[i]!=0){
                    int temp=nums[p];
                    nums[p]=nums[i];
                    nums[i]=temp;

                    p++;
                }
            }
            return nums;
        }

}
