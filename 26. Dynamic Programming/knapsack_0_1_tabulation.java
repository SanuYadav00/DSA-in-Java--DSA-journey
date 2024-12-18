/* Given the weights and values of N items, put these items in a knapsack 
of capacity W to get the maximum total value in the knapsack. You can either 
put the whole item or skip the item.   Use tabulation   
 */
// Time Complexity O(n*w) where n=no. of items and w=total capacity of knapsack
// Space Complexity
import java.util.*;
public class knapsack_0_1_tabulation {
      public static int maximum(int weights[],int values[],int w,int n,int dp[][]) {
      for (int i=0;i<dp.length;i++) {
            dp[i][0]=0;
      }
      for (int j=0;j<dp[0].length;j++) {
            dp[0][j]=0;
      }

      for (int i=1;i<dp.length;i++) { // items
        for (int j=1;j<dp[0].length;j++) { // total capacity
           int wt=weights[i-1]; // ith item weight
           int v=values[i-1]; // ith item value
           if (wt<=j) {
            // include
            int profit1=v+dp[i-1][j-wt];

            // exclude
            int profit2=dp[i-1][j];
            dp[i][j]=Math.max(profit1,profit2);
           }
           else {
            dp[i][j]=dp[i-1][j];
           }
        }
      }
       return dp[dp.length-1][dp[0].length-1];
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