package Array;

public class LC_169 {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;

        for(int num:nums){
            if(candidate==0){
                candidate=num;
            }

            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
