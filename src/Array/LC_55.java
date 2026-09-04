package Array;

public class LC_55 {
    static void main() {
        System.out.println(canJump(new int[]{3, 2, 1, 1, 4}));
    }
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int last=n-1;
        for(int i=n-1;i>=0;i--){
            int curJump=i+nums[i];
            if(last<=curJump){
                last=i;
            }
        }
        return last==0;
    }
    }
