package Array;

public class LC_674 {
    public int findLengthOfLCIS(int[] nums) {
        int max_val=1;
        int count=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            max_val=Math.max(max_val, count);
        }
        return max_val;
    }

}
