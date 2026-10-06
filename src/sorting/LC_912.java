package sorting;

import java.util.Arrays;

public class LC_912 {
    static void main() {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 2, 3, 1})));
    }
    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private static void mergeSort(int[] arr, int i, int j) {
        if (i>=j) return;

        int mid=(i+j)/2;

        mergeSort(arr,i,mid);
        mergeSort(arr,mid+1,j);
        sorted(arr,i,mid,j);
    }

    private static void sorted(int[] arr, int left, int mid, int right) {
        int []temp=new int[right-left+1];
        int i=left;
        int k=0;
        int j=mid+1;

        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=right){
            temp[k++]=arr[j++];
        }

        for (i = left,k=0; i<=right; i++,k++) {
            arr[i]=temp[k];
        }
    }
}
