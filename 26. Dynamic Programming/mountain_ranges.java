/* Write a program to find total no. of mountain ranges possible  with given n pairs of upstroke(mountains) &
downstrokes (valleys).
Note: At any moment , the no of downstroke cannot be more than number of upstrokes. (We cannot go below land level)
// It is also a variation of catalan number
n=3
ans=5
 */
// It is also a variation of catalan number problem
// TC (n^n)
// SC O(n) due to extra array dp
import java.util.*;
public class mountain_ranges {
  public static int  count (int n) {
     int dp[]=new int[n+1];
     dp[0]=1;
     dp[1]=1;
     for (int i=2;i<=n;i++) {
      // mountains ranges possible for i no. of pairs
      for (int j=0;j<i;j++) {
        int inside=dp[j]; // ranges possible using inside pairs
        int outside=dp[i-j-1]; // ranges possible using outside pairs
        dp[i]+=inside*outside;
      }
     }
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of pairs of upstroke and downstroke:");
    int n=sc.nextInt();
    System.out.println("The total number of mountain ranges possible with  "+n+" pairs is:"+count(n));
    sc.close();
  }
}
