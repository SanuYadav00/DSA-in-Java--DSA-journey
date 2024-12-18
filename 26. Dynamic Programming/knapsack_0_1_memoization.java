/* Given the weights and values of N items, put these items in a knapsack 
of capacity W to get the maximum total value in the knapsack. You can either 
put the whole item or skip the item.   Use memoization   
 */
// Time Complexity O(n*w) where n=no. of items and w=total capacity of knapsack
// Space Complexity
import java.util.*;
public class knapsack_0_1_memoization {
      public static int maximum(int weights[],int values[],int w,int n,int dp[][]) {
         if (w==0 || n==0) {
            return 0;
         }
         if (dp[n][w]!=-1) {
            return dp[n][w];
         }
         if (weights[n-1]<=w) {
            // include
            int ans1=values[n-1]+maximum(weights,values,w-weights[n-1],n-1,dp);

            // exclude
            int ans2=maximum(weights,values,w,n-1,dp);
            
            dp[n][w]=Math.max(ans1,ans2);
            return dp[n][w];
         }
         else {
            dp[n][w]=maximum(weights,values,w,n-1,dp);
            return dp[n][w];
         }

      }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of items:");
            int n=sc.nextInt();
            System.out.print("Enter the total capacity of the knapsack:");
            int w=sc.nextInt();
            int weights[]=new int[n];
            int values[]=new int[n];
            System.out.print("Enter the weight of all the items:");
            for (int i=0;i<n;i++) {
                  weights[i]=sc.nextInt();
            }
            System.out.print("Enter the values of all items:");
            for (int i=0;i<n;i++) {
                  values[i]=sc.nextInt();
            }
            int dp[][]=new int[n+1][w+1];
            for (int i=0;i<=n;i++) {
                  for (int j=0;j<=w;j++) {
                        dp[i][j]=-1;
                  }
            }
            System.out.println("The maximum value in knapsack is:"+maximum(weights,values,w,n,dp));
            sc.close();

      }
}