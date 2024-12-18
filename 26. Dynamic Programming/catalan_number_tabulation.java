/* Write a program to find catalan number for a given value of n
 Cn=C0Cn-1+C1Cn-2+......+Cn-2C1+CnC0 using tabulation
 */
// TC (n^n)
// SC O(n) due to extra array dp
import java.util.*;
public class catalan_number_tabulation {
  public static int  find (int n) {
     int dp[]=new int[n+1];
     dp[0]=1;
     dp[1]=1;
     for (int i=2;i<=n;i++) {
      for (int j=0;j<i;j++) {
        dp[i]+=dp[j]*dp[i-j-1];
      }
     }
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    System.out.println("The catalan number "+n+"th term is:"+find(n));
    sc.close();
  }
}
