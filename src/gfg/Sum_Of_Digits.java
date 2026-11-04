package gfg;

public class Sum_Of_Digits {
    static int sumOfDigits(int n) {
        // code here
        if(n<=0){
            return n;
        }

        return (n%10)+ sumOfDigits(n/10);
    }

}
