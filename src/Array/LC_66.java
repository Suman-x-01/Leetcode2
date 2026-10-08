package Array;

import java.util.Arrays;

public class LC_66 {
    static void main() {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 9})));
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]<9){
                digits[i]++;

                return digits;
            }
            digits[i]=0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
