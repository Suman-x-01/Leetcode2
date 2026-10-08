package Array;

public class LC_35
{
    static void main() {
        System.out.println(searchInsert(new int[]{1,3,4,5,8},4));
    }
    public static int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}
