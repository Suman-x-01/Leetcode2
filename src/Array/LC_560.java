package Array;

public class LC_560 {
    static void main() {
        System.out.println(subarraySum(new int[]{1,2,3},3));
    }
    public static int subarraySum(int[] nums, int k) {

//        broute-force approach
        int count=0;
        for (int i=0;i<nums.length;i++){
            int sum=0;
            for (int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
