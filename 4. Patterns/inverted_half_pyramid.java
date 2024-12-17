/* WAP to print a pattern like 
    12345
    1234
    123
    12
    1

*/
import java.util.*;
public class inverted_half_pyramid {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the pyramid:");
    int a=sc.nextInt();
    for (int i=1;i<=a;i++) {
        for (int j=1;j<=a+1-i;j++) {
            

            System.out.print(j);
    }
    System.out.print("\n");
    
   } 
   sc.close();
}

    
}
