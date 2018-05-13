import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */        
        boolean first = true;
        StringBuilder sb = new StringBuilder(n);
        for(int i = n; i > 0; i--){
            sb.append(" ");
        }
        for(int i = n; i > 0; i--){ 
            sb.replace(i-1,i, "#");
            System.out.print(sb.toString());
            if(i!=0){                
                System.out.println();
            }
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
