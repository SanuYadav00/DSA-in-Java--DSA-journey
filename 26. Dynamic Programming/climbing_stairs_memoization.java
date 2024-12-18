/* Write a program to count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
 Use memoization
 */
// O(n)
import java.util.*;
public class climbing_stairs_memoization {
  public static int count (int n,int dp[]) {
    if (n==0) {
      dp[0]=1;
      return 1;
    }
    if (n<0) {
      return 0;
    }
    if (dp[n]!=-1) {
      return dp[n];
    }
    dp[n]=count(n-1,dp)+count(n-2,dp);
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1); // stores -1 at every index of dp array
    int a=count(n,dp);
    System.out.println("The total ways to reach "+n+"th stair is:"+a);
    sc.close();
  }
}
