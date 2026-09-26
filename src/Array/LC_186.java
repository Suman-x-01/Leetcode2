package Array;
/*
Input: ['t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e']
OP: ['b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e']
 */
public class LC_186 {
    static void main() {
        System.out.println(arrange(new char[]{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'}));
    }
    public static char[] arrange(char[]arr){
        int last=arr.length-1;
        int first=0;

//        reverse the array
            reverse(arr,first,last);
        

//        reverse the each word
        int point=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' '){
                reverse(arr,point,i-1);
                arr[i]=' ';
                point=i+1;
            }
        }
        reverse(arr,point,arr.length-1);
        return arr;
        
    }
    public static void reverse(char[]arr,int s,int end){
        while (s<end){
            char temp=arr[s];
            arr[s]=arr[end];
            arr[end]=temp;
            s++;
            end--;
        }
    }
}
