/* Write a program if 2 strings are anagrams or not.
 If two strings contain the same characters but 
 in a different order, they can be said to be anagrams.
 Consider race and care. In this case, race's characters can 
 be formed in to a study, or care's characters can be 
 formed into race.
 */
import java.util.*;
public class anagrams {
    public static boolean check (String str1,String str2) {
        int m=str1.length();
        int n=str2.length();
        if (m==n) {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            char[] str1chararray=str1.toCharArray();
            char[] str2chararray=str2.toCharArray();
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            boolean result=Arrays.equals(str1chararray,str2chararray);
            return result;
    }
    else {
        return false;
    }
}

    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String sen1,sen2;
        System.out.print("Enter a string:");
        sen1=sc.nextLine();
        System.out.print("Enter another string:");
        sen2=sc.nextLine();
        System.out.println("The first inputted string is:"+sen1);
        System.out.println("The another inputted string is:"+sen2);
        boolean st=check(sen1,sen2);
        
        if (st==true) {
            System.out.print("The given strings are anagrams.");
        }
        else {
            System.out.print("The given strings are not anagrams.");
        }
        sc.close();

      
    }
}
