package String;

public class LC_168 {
    static void main() {
        System.out.println(convertToTitle(50));
    }
    public static String convertToTitle(int columnNumber) {
            StringBuilder res=new StringBuilder();
        while (columnNumber>0){
//            column start from 1 in excel but in programming it start from 0 thats why we --
            columnNumber--;
            int rem=columnNumber%26;
            res.append((char)(rem+'A'));
            columnNumber /=26;

        }
        return res.reverse().toString();
    }
    }
