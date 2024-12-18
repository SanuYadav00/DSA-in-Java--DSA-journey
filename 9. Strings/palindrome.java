/* Write  a program in java to check if a given string is palindrome or not */
import java.util.*;
public class palindrome {
    public static boolean check (String str) {
        int n=str.length();
        for (int i=0;i<=(n/2);i++) {
            if (str.charAt(i)!=str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String sentence;
        System.out.println("Enter a string:");
        sentence=sc.nextLine();
        System.out.println("The inputted string is:\n"+sentence);
        boolean st=check(sentence);
        
        if (st==true) {
            System.out.print("The given string is palindrome.");
        }
        else {
            System.out.print("The given string is not palindrome.");
        }
        sc.close();

      
    }
}