/* Write  a program in java to count the times a lowercase vowel was entered by a user in a string  */
import java.util.*;
public class count_lowercase_vowels {
    public static int count (String str) {
        int n=str.length();
        int count=0;
        for (int i=0;i<n;i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String sentence;
        System.out.println("Enter a string:");
        sentence=sc.nextLine();
        System.out.println("The inputted string is:\n"+sentence);
        int st=count(sentence);
        
        System.out.print("The number of lowercase vowel in the string is:"+st);
        sc.close();

      
    }
}