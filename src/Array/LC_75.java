package Array;

public class LC_75 {
    public static int[] sortColors(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return nums;
    }

    static void main() {
        int []arr={2,0,1,0,2};
        int arr2[]=sortColors(arr);
        for(int i:arr2){
            System.out.println(i);
        }
    }
    }
