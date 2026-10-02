package String;

public class LC_496 {
    static void main() {
        System.out.println(countBinarySubstrings("110010"));
    }
    public static int countBinarySubstrings(String s) {
        int previous=0;
        int current=1;
        int count=0;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)){
                current++;
            }else{
                count+=Math.min(current,previous);
                previous=current;
                current=1;
            }
        }
//        001101 0+2+1+1
        count+=Math.min(current,previous);
        return count;
    }
}
