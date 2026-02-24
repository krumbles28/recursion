public class Q4{
    private static int count;
    public static int digicount(long N, int D,int position){
        String str = String.valueOf(N);
        char c = (char) (D +'0');
        if(position < str.length()) {
            if (c == str.charAt(position)) {
               count++; 
            }
            return digicount(N, D, position + 1);
             
        }
        return count;
    }

     public static void main(String[] args) {
        long num = 31245871347621735l;
        System.out.println(digicount(num,8, 0));
    }
}