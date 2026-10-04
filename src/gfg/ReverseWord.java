package gfg;
//https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
public class ReverseWord {
    static void main() {
        System.out.println(reverseWords(".i.like.this.program.very.much."));
    }
    public static String reverseWords(String s) {
        // Code here
        StringBuilder sb=new StringBuilder();
        int p=s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='.' ){
                if(i+1<p){

                    sb.append(s, i+1, p);
                    sb.append('.');
                }
                    p=i;

            }
            if(i==0){
                sb.append(s, i, p);
            }

        }
        if(!sb.isEmpty() && sb.charAt(sb.length()-1)=='.'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
