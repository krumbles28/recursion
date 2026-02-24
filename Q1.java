public class Q1 {

    public static int letcount(String S, int position){
        if (position >= S.length()){
            return position;
        }
        return letcount(S, position+1);
    }
    
}