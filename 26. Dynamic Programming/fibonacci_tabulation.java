/* Write a program to find fibonacci sequence using dynamic programming and by using tabulation*/
// TC O(n)
// without dp O(2^n)
import java.util.*;
public class fibonacci_tabulation {
  public static int find(int n) {
    int dp[]=new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for (int i=2;i<=n;i++) {
      dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int a=find(n);
    System.out.println("The nth sequence is:"+a);
    sc.close();
  }
}