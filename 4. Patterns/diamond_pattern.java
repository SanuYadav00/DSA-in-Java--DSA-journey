/* WAP to print a pattern like 
                *
               ***
              *****
             *******
            *********
            *********
             *******
              *****
               ***
                *

*/
import java.util.*;
public class diamond_pattern {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the pattern:");
    int a=sc.nextInt();
    int b=a/2;
    for (int i=1;i<=b;i++) {
        for (int k=1;k<=b-i;k++) {
            System.out.print(" ");
        }
        for (int j=1;j<=2*i-1;j++) {
            System.out.print("*");
    }
    System.out.print("\n");
    
   } 
   for (int i=b;i>=1;i--) {
    for (int k=1;k<=b-i;k++) {
        System.out.print(" ");
    }
    for (int j=1;j<=2*i-1;j++) {
        System.out.print("*");
}
System.out.print("\n");

} 
   sc.close();
}

    
}
