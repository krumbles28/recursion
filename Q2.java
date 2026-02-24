public class Q2 {

    public static int charcount(String S, char c,int position,int count){
        if(position < S.length()) {
            if (c == S.charAt(position)) {
               count++; 
            }
            return charcount(S, c, position + 1, count);
             
        }
        return count;
    }
    public static void main(String[] args) {
        char c = 'i';
        System.out.println(charcount("hi",c, 0,0));
    }
}