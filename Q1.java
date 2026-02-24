import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Q1 {

    public static int charcount(String S, int position){
        if (position >= S.length()){
            return position;
        }
        return charcount(S, position+1);
    }
    public static void main(String[] args) {
        System.out.println(charcount("headass", 0));
    }
}