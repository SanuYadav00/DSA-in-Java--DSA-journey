/* WAP to print a pattern like 
    A
    BC
    DEF
    GHIJ
    KLMNO

*/
import java.util.*;
public class character_pattern {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the pyramid:");
    int a=sc.nextInt();
    char c='A';
    for (int i=1;i<=a;i++) {
        for (int j=1;j<=i;j++) {
            System.out.print(c);
            c++;
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}
