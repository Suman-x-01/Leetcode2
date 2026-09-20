package Array;

public class LC_26 {
    static void main() {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        int p=0;
        for(int q=0;q<nums.length;q++){
            if (nums[p]!=nums[q]){
                p++;
                nums[p]=nums[q];
            }
        }
        return p+1;
    }
    }
