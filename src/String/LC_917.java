package String;



public class LC_917 {
    static void main() {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    static boolean isLetter(char ch){
        return (ch>='a' && ch<='z') || (ch>='A'&& ch<='Z');
    }
    public static String reverseOnlyLetters(String s) {
        int right=s.length()-1;
        int left=0;
        char []arr;
        arr=s.toCharArray();
        while (left<right){
            while (left < right && !isLetter(arr[left])) {
                left++;
            }

            while (left < right && !isLetter(arr[right])) {
                right--;
            }
//            swap
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
