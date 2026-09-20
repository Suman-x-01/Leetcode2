package Array;

import java.util.Arrays;
import java.util.HashMap;

public class LC_167 {
    static void main() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
        int complement=target-numbers[i];
        if(map.containsKey(complement)){
            return new int[]{
              map.get(complement)+1,i+1
            };
        }
            map.put(numbers[i],i);
        }

     return new int[]{};
    }
}
