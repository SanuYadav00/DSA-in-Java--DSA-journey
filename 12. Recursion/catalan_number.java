/* Write a program to find catalan number for a given value of n
 Cn=C0Cn-1+C1Cn-2+......+Cn-2C1+CnC0
 */
// TC (4^n) exponential time complexity
import java.util.*;
public class catalan_number {
  public static int  find (int n) {
     if (n==0 || n==1) {
      return 1;
     }
     int ans=0;
     for (int i=0;i<n;i++) {
      ans=ans+(find(i)*find(n-i-1));
     }
   return ans;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    System.out.println("The catalan numbers upto "+n+"th term are:");
    for (int i=0;i<=n;i++) {
      System.out.println(find(i));
    }
    sc.close();
  }
}
