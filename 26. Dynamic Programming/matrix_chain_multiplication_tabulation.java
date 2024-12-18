/* Write a program to find the min cost to multiply matrices. The row and columns of the matrices are stored in a array
 using tabulation
 */
// TC O(n*n)
// DP SC O(n*n) Stack SC O(n) , dominant term is O(n*n) so overall SC O(n*n)
import java.util.*;
public class matrix_chain_multiplication_tabulation {
  public static void mcm(int arr[]) {
    int n=arr.length;
    int dp[][]=new int[n][n];
    for (int i=0;i<n;i++) {
      dp[i][i]=0;
    }
    for (int len=2;len<=n-1;len++) {
      for (int i=1;i<=n-len;i++) {
        int j=i+len-1; // column value
        dp[i][j]=Integer.MAX_VALUE;
        for (int k=i;k<=j-1;k++) {
          int cost1=dp[i][k];
          int cost2=dp[k+1][j];
          int cost3=arr[i-1]*arr[k]*arr[j];
          dp[i][j]=Math.min(dp[i][j],cost1+cost2+cost3);
        }
      }
    }
    System.out.println("The minimum cost for matrix chain multiplication is:"+dp[1][n-1]);
    System.out.println("The elements of dp are:");
    for (int i=0;i<dp.length;i++) {
      for (int j=0;j<dp[0].length;j++) {
        System.out.print(" "+dp[i][j]);
      }
      System.out.println();
    }
    return;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of matrices:");
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.print("Enter the rows and columns in sequential way:");
    for (int i=0;i<=n;i++) {
      arr[i]=sc.nextInt();
    }
    mcm(arr);
    sc.close();
  }
}
