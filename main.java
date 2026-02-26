import java.util.Arrays;
import java.util.Scanner;
public class main{

public static void main(String[] args) {
        System.out.println("Please enter your string for Q1:");
        Scanner scanner = new Scanner(System.in);

        String Q1string = scanner.nextLine();
        
        System.out.println("Your character count is: "+Q1.letcount(Q1string, 0));


        System.out.println("Please enter your string and character for Q2:");

        String Q2string = scanner.next();
        String Q2char = scanner.next();
        
        System.out.println("Your character count is: "+Q2.charcount(Q2string,Q2char.charAt(0), 0));
    
    System.out.println("Please enter your list of integers (please seperate them with a ',') for Q3:");

        String Q3int = scanner.next();
        
        
        System.out.println("The maximum in this list is: "+Q3.max(Q3int, 0));    

        System.out.println("Please enter your interger and digit for Q4:");

        long Q4long = scanner.nextLong();
        int Q4digi = scanner.nextInt();
        
        
        System.out.println("There are "+Q4.digicount(Q4long,Q4digi, 0) + " of the digit "+ Q4digi+ " in " + Q4long); 
    
        System.out.println("Please enter your string for Q5:");

        String Q5string = scanner.next();
        
        
        System.out.println("The new string is: "+Q5.reverseString(Q5string, 0)); 

         System.out.println("Please enter your list of integers for Q6:");
         String[] test= scanner.next().split(",");
        int Q6array[] = Arrays.stream(test).mapToInt(Integer::parseInt).toArray();
        
        System.out.println("The even sum is: "+Q6.evenSum(Q6array, 0)); 
    
        scanner.close();
 

    }
} 
