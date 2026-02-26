
public class Q1 {

    public static int letcount(String S, int position){
        if (position >= S.length()){
            return position;
        }else{
            return letcount(S, position+1);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(letcount("bruh", 0));
    }
    
}
