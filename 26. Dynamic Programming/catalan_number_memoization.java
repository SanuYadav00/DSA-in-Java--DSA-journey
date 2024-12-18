/* Write a program to find catalan number for a given value of n
 Cn=C0Cn-1+C1Cn-2+......+Cn-2C1+CnC0 using memoization
 */
// TC (n^n)
// SC O(n) due to extra array dp
import java.util.*;
public class catalan_number_memoization {
  public static int  find (int n,int dp[]) {
     if (n==0 || n==1) {
      return 1;
     }
     if (dp[n]!=-1) {
      return dp[n];
     }
     int ans=0;
     for (int i=0;i<n;i++) {
      dp[i]=find(i,dp);
      dp[n-i-1]=find(n-i-1,dp);
      ans=ans+(dp[i]*dp[n-i-1]);
     }
    dp[n]=ans;
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    System.out.println("The catalan number "+n+"th term is:"+find(n,dp));
    sc.close();
  }
}
