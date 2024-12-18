/* Write  a program in java to know the working of different inbuilt replace 
  functions in Java
 */
import java.util.*;
public class replace_function {
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String sentence;
        System.out.print("Enter a string:");
        sentence=sc.nextLine();
        System.out.println("The inputted string is:\n"+sentence);
        String S1=sentence.replace("a","e");
        String S2=sentence.replace("am","is");
        String S3=sentence.replaceAll("I am Sanu", "He is Sanu");
        String S4=sentence.replaceFirst("I am Sanu", "He is Sanu");
        System.out.println("The string is:"+S1);
        System.out.println("The string is:"+S2);
        System.out.println("The string is:"+S3);
        System.out.println("The string is:"+S4);
        sc.close();


        

      
    }
}