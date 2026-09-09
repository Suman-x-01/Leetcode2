package Array;


public class LC_2358
{
    static void main() {
        System.out.println(maximumGroups(new int[]{10, 1, 1, 1, 1}));
    }


public static int maximumGroups(int[] grades) {
int count=0;
int groupSize=1;
int index=0;
while (index+groupSize<=grades.length){
    count++;
    index=index+groupSize;
    groupSize++;
}
return count;

}
    }
