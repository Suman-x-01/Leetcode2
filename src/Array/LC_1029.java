package Array;

import java.util.Arrays;

public class LC_1029 {

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a, b)->
                Integer.compare(a[0]-a[1],b[0]-b[1])
        );
        int res=0;

        for(int i=0;i<costs.length;i++){
            if(i<costs.length/2){

                res+=costs[i][0];
            }else{
                res+=costs[i][1];
            }
        }
        return res;
    }
}