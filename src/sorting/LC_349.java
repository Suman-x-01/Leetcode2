package sorting;

import java.util.HashSet;
import java.util.Set;

public class LC_349 {
    static void main() {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }

        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int []arr=new int[set2.size()];
        int p=0;
        for(int i:set2){
            arr[p++]=i;
        }

        return arr;
    }
}
