package Array;

public class LC_557 {
    static void main() {
        System.out.println(reverseWords("Hello world"));
    }
    public static String reverseWords(String s) {
        char[]arr=s.toCharArray();
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){

                reverse(p,i-1,arr);
                // arr[q]=' ';
                p=i+1;
            }
        }
        reverse(p, arr.length-1, arr);
        return new String(arr);
    }
    public static void reverse(int p, int q, char[]arr){
        while(p<q){
            char temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;
            p++;q--;
        }
    }
}
