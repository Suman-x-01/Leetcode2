package Array;

public class LC_1004 {
    static void main() {
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3));
    }
    public  static int longestOnes(int[] nums, int k) {
        int left=0,zeroCount=0,max=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            while (zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            int temp=right-left+1;
            max=Math.max(max,temp);
        }
        return max;
    }
    }
