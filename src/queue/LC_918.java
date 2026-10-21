package queue;

public class LC_918 {
    static void main() {
        System.out.println(maxSubarraySumCircular(new int[]{1,-2,3,-2}));
    }
    public static int maxSubarraySumCircular(int[] nums) {
//        if (nums.length==0) return 0;
        int maxSum=nums[0], currentMax=nums[0];
        int minSum=nums[0], currentMin=nums[0];
        int total=0;
        for (int i=0;i<nums.length;i++){
            total+=nums[i];
            if (i>0){
                currentMax=Math.max(nums[i],currentMax+nums[i]);
                maxSum=Math.max(maxSum,currentMax);

                currentMin=Math.min(nums[i],currentMin+nums[i]);
                minSum=Math.min(minSum,currentMin);
            }
        }

        if (maxSum<0){
            return maxSum;
        }
        return  Math.max(maxSum,total-minSum);
    }
}
