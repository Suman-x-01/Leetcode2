package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_350 {
    static void main() {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> al=new ArrayList<>();

        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:nums2){
            if(map.getOrDefault(i,0)>0){
                al.add(i);
                map.put(i, map.get(i)-1);
            }
        }

        int[] arr=new int[al.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }

        return arr;
    }
}
