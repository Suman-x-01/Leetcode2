package gfg;
//https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1
public class BinarySearch {
    static void main() {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 6},6));
    }
    public static boolean binarySearch(int[] arr, int k) {
        // code here
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }

}
