import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Q1 {

    public static int letcount(String S, int position){
        if (position >= S.length()){
            return position;
        }
        return letcount(S, position+1);
    }
    
}