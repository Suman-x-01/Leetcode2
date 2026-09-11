package Array;

public class LC_53 {
    static void main() {
        System.out.println(maxSubArray(new int[]{-2,1,-3,-4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int current=nums[0], max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            current=Math.max(current+nums[i],nums[i]);
            max=Math.max(current,max);
        }
        return max;
    }
    }
