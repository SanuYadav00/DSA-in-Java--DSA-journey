/* Given the weights and values of N items, put these items in a knapsack 
of capacity W to get the maximum total value in the knapsack. You can either 
put the whole item or skip the item. You can the put the same item any times in the knapsack
   Use tabulation   
 */
// Time Complexity O(n*sum) where n=no. of coins and sum=change sum
// Space Complexity
import java.util.*;
public class coin_change {
      public static int ways(int coins[],int sum,int n,int dp[][]) {
      for (int i=0;i<dp.length;i++) {
            dp[i][0]=1;
      }
      for (int j=1;j<dp[0].length;j++) {
            dp[0][j]=0;
      }

      for (int i=1;i<dp.length;i++) { // total no. of coins
        for (int j=1;j<dp[0].length;j++) { // total change amount
           int val=coins[i-1]; // value of ith coin
           if (val<=j) { // valid
            dp[i][j]=dp[i][j-val]+dp[i-1][j];
           }
           else { // invalid
            dp[i][j]=dp[i-1][j];
           }
        }
      }
       return dp[dp.length-1][dp[0].length-1];
      }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of options of coins:");
            int n=sc.nextInt();
            System.out.print("Enter the total amount of change:");
            int sum=sc.nextInt();
            int coins[]=new int[n];
            System.out.print("Enter all the values of coins:");
            for (int i=0;i<n;i++) {
                  coins[i]=sc.nextInt();
            }
            int dp[][]=new int[n+1][sum+1];
            for (int i=0;i<=n;i++) {
                  for (int j=0;j<=sum;j++) {
                        dp[i][j]=-1;
                  }
            }
            System.out.println("The total ways of giving the change is:"+ways(coins,sum,n,dp));
            System.out.println("The elements of dp are:");
            for (int i=0;i<dp.length;i++) {
                  for (int j=0;j<dp[0].length;j++) {
                        System.out.print(dp[i][j]+" ");
                  }
                  System.out.println();
            }
            System.out.println();
            sc.close();

      }
}