package Array;

public class LC_122 {
    static void main() {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
    public static int maxProfit(int[] prices) {
        int total=0;
        for(int i=0;i<prices.length-1;i++){
            if (prices[i]<prices[i+1]){
                total+=prices[i+1]-prices[i];
            }
        }
           return total;
    }

}
