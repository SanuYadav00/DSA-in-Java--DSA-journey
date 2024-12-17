/* WAP to print a pattern like 
    *****
    ****
    ***
    **
    *
*/
import java.util.*;
public class inverted_star_pattern {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the square pattern:");
    int a=sc.nextInt();
    for (int i=0;i<a;i++) {
        for (int j=i;j<a;j++) {
            System.out.print("*");
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}