public class Q5{
    private static String newS = "";
public static String reverseString(String S, int left){
    if(left < S.length()){
       newS = S.charAt(left) + newS;
         return reverseString(S,left+1); 
    }
return newS;
    
}
public static void main(String[] args) {
        String test = "happy";
        System.out.println(reverseString(test,0));
    }
}