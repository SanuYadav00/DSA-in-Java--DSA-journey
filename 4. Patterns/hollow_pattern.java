/* WAP to print a pattern like 
    *****
    *   *
    *   *
    *****
    
*/
import java.util.*;
public class hollow_pattern {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the rectangular pattern:");
    int a=sc.nextInt();
    System.out.print("Enter breadth of the rectangular pattern:");
    int b=sc.nextInt();
    for (int i=0;i<a;i++) {
        for (int j=0;j<b;j++) {
            if (i==0 || i==a-1 || j==0 || j==b-1) {
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