package Array;

import java.util.*;

public class LC_414 {

        public int thirdMax(int[] nums) {
            Set<Integer> s=new HashSet<>();
            for(int i:nums){
                s.add(i);
            }

            List<Integer> al=new ArrayList<>(s);

            Collections.sort(al);

            if(al.size()>=3){
                return al.get(al.size()-3);
            }else{
                return al.get(al.size()-1);
            }
        }

}
