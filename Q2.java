public class Q2 {
private static int count;
    public static int charcount(String S, char c,int position){
        if(position < S.length()) {
            if (c == S.charAt(position)) {
               count++; 
            }
            return charcount(S, c, position + 1);
             
        }
        return count;
    }
    public static void main(String[] args) {
        char c = '5';
        System.out.println(charcount("9826546276391927478526741724367356478312635346423657836896467353",c, 0));
    }
}