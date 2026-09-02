void main() {
//        Question: First Non-Repeating Character
    String str = "swiss Chocolate";
//    int i=0,j=i+1;
    for (int i = 0; i < str.length(); i++) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {

            if (str.charAt(i) == str.charAt(j)) {
//                duplicate found
                count++;
            }
        }
        if (count == 1) {
            IO.println(str.charAt(i));
            break;
        }

    }
}
