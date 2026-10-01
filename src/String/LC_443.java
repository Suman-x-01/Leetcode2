package String;



public class LC_443 {
    static void main() {
        System.out.println(compress(new char[]{'a'}));
    }
    public static int compress(char[] chars) {
       int write=0;
       int i=0;
        while(i<chars.length ){
            char current=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==current){
                count++;
                i++;
            }
            chars[write++]=current;
            if (count>1){
                String currentCount=String.valueOf(count);

                for(char ch:currentCount.toCharArray()){

                chars[write++]=ch;
                }

            }
        }
        return write;
    }
    }
