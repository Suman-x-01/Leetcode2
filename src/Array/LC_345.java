package Array;

public class LC_345 {
    static void main() {
        System.out.println(reverseVowels(new String("IceCreAm")));
    }
    public static String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char []arr=s.toCharArray();
        while(l<r){
            while(l<r &&!"aeiouAEIOU".contains(String.valueOf(arr[l]))){
                l++;
            }
            while(l<r && !"aeiouAEIOU".contains(String.valueOf(arr[r]))){
                r--;
            }
            // swap
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}
