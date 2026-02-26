public class Q6{
    private static int sum = 0;
    
    public static int evenSum(int num[], int position){
        if (position < num.length){
            if (num[position] % 2 == 0){
                sum = num[position] + sum;
            }
            return evenSum(num, position+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int num[] ={30,40,5};
        System.out.println(evenSum(num,0));
    }
}