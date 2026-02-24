import java.util.Arrays;

public class Q3 {

    public static int max(String S,int position,int max){
        String[] strArray = S.split(",");
        int[] intArray = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();

        if (position < intArray.length){
            if ( max < intArray[position]){
                max = intArray [position];
                return max(S,position+1,max);
            }else{
                return max (S,position+1,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max("30,90,40,20,2", 0,0));
    }
}