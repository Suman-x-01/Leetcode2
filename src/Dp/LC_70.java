package Dp;

public class LC_70 {
    static void main() {
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int first=1, second=2;
        for(int i=3;i<=n;i++){
            int current=first+second;
            first=second;
            second=current;
        }
        return second;
    }
}
