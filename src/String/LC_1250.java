package String;

public class LC_1250 {
    static void main() {
        System.out.println(isGoodArray(new int[]{3,6,7}));
    }
    public static boolean isGoodArray(int[] nums) {
        int gcd=0;
        for(int num:nums){
            gcd=gcdCalculate(gcd,num);
            if(gcd==1){
                return true;
            }
        }
        return false;
    }

    private static int gcdCalculate(int gcd, int num) {
        while (num!=0){
            int temp=num;
            num=gcd%num;
            gcd=temp;
        }
        return gcd;
    }
}
