/* WAP to print a pattern like 
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

*/
import java.util.*;
public class zero_one_triangle {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the pyramid:");
    int a=sc.nextInt();

    for (int i=1;i<=a;i++) {
        for (int j=1;j<=i;j++) {
        if ((j%2==1 && i%2==1) || (j%2==0 && i%2==0)) {
          System.out.print("1 ");
        }
        else {
            System.out.print("0 ");
        }
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}
