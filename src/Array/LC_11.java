package Array;

public class LC_11 {
    static void main() {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int countMax=0;
        while (l<=r){
            if(height[l]<height[r]){
                int temp=height[l]*(r-l);
                if (countMax<temp) countMax=temp;
                l++;
            }else if (height[l]>height[r]){
                int temp=height[r]*(r-l);
                if (countMax<temp) countMax=temp;

                r--;

            }else{
                int temp=r*(r-l);
                if (countMax<temp) countMax=temp;

                r--;
            }
        }
        return countMax;
    }
}
