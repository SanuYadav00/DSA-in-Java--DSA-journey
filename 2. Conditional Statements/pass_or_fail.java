/* WAP to check a student is pass or fail */
import java.util.*;
public class pass_or_fail {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the mark obtained by the student:");
    int mark=sc.nextInt();
    String result=(mark>=33)?"pass":"fail";
    System.out.println("The result of the student is:"+result);


    sc.close();
   } 
}

