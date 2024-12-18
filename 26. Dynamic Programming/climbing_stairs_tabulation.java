/* Write a program to count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
 Use tabulation
 */
// O(n)
import java.util.*;
public class climbing_stairs_tabulation {
  public static int count (int n) {
    int dp[]=new int[n+1];
    dp[0]=1; 
    for (int i=1;i<=n;i++) {
      if (i==1) {
        dp[i]=dp[i-1]+0;
      }
      else {
      dp[i]=dp[i-1]+dp[i-2];
      }
    }
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    int a=count(n);
    System.out.println("The total ways to reach "+n+"th stair is:"+a);
    sc.close();
  }
}
