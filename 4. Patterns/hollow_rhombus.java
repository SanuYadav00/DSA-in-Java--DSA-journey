/* WAP to print a pattern like 
            *****
           *   *
          *   *
         *   *
        *****

*/
import java.util.*;
public class hollow_rhombus {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the solid rhombus:");
    int a=sc.nextInt();
    for (int i=0;i<a;i++) {
        for (int k=0;k<=a-i;k++) {
            System.out.print(" ");
        }
        for (int j=0;j<a;j++) {
            if (i==0 || j==0 || i==a-1 || j==a-1) {
            System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}
