package String;

public class LC_824 {
    static void main() {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
    static String addMa(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("ma");
        while(i>0){
            sb.append('a');
            i--;
        }
        return sb.toString();
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder finalStr=new StringBuilder();
        String[] words = sentence.split(" ");
        int i=1;
        for (String word:words){
            char first = word.charAt(0);
            if ("aeiouAEIOU".indexOf(first) != -1){
//            vowel
                finalStr.append(addMa(word,i));


            }else{
//                consonant
//                get the first char and add it ot end
                StringBuilder sb = new StringBuilder(word);
                char c = sb.charAt(0);  // h
                sb.deleteCharAt(0);         // ello
                sb.append(c);// elloh


                finalStr.append(addMa(sb.toString(), i));



            }
            if (i< words.length){

                finalStr.append(' ');
            }
            i++;
        }
        return finalStr.toString();

    }
}
