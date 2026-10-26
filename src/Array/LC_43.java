package Array;

public class LC_43 {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();

        int []result=new int[m+n];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';

                int sum=d1*d2+result[i+j+1];

                result[i+j+1]=sum%10;
                result[i+j]+=sum/10;
            }
        }

        StringBuilder sb=new StringBuilder();

        for(int digit:result){
            if(sb.isEmpty() && digit==0){
                continue;
            }
            sb.append(digit);
        }
        return sb.isEmpty() ? "0":sb.toString();
    }
}
