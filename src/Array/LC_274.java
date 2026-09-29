package Array;

import java.util.Arrays;

public class LC_274 {
    static void main() {
        System.out.println(hIndex(new int[]{0,3,1,5,6}));
    }
    public static int hIndex(int[] citations) {
        // int max=0;

        // for(int i=0;i<citations.length;i++){
        // int count=0;
        //     for (int j=0;j<citations.length;j++){

        //         if((i+1)<=citations[j]){
        //             count++;
        //         }
        //     }
        //     if(count>=(i+1)){
        //         max=i+1;
        //     }
        // }
        // return max;

        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int paper=citations.length-i;
            if(citations[i]>=paper){
                return paper;
            }
        }
        return 0;
    }
}