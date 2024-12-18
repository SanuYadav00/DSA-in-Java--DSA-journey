/* Write  a program in java to print the desired substring of a string */
import java.util.*;
public class substring {
    public static String substrings (String str,int si, int ei) {
        String sub="";
        for (int i=si;i<ei;i++) {
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String sentence;
        System.out.println("Enter a string:");
        sentence=sc.nextLine();
        System.out.println("The inputted string is:\n"+sentence);
        System.out.println("Enter the starting index of the string for substring:");
        int si=sc.nextInt();
        System.out.println("Enter the ending index of the string for substring:");
        int ei=sc.nextInt();
        String st=substrings(sentence,si,ei);
        System.out.println("The resultant substring is:"+st);
        sc.close();

      
    }
}