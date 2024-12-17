/* WAP to print a pattern like 
    1
    12
    123
    1234
    12345

*/
import java.util.*;
public class half_pyramid {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the pyramid:");
    int a=sc.nextInt();
    for (int i=1;i<=a;i++) {
        for (int j=1;j<=i;j++) {
            System.out.print(j);
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}
