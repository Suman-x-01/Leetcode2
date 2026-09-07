package Array;

public class LC_1539 {
    static void main() {
        System.out.println(findKthPositive(new int[]{2},1));
    }

    public static int findKthPositive(int[] arr, int k) {

        int left=0,right= arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            int missing=arr[mid]-(mid+1);

            if(missing<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left+k;

    }



}
