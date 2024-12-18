/* Write a program to find the min cost to multiply matrices. The row and columns of the matrices are stored in a array
 using memoization
 */
// TC O(n*n)
// DP SC O(n*n) Stack SC O(n) , dominant term is O(n*n) so overall SC O(n*n)
import java.util.*;
public class matrix_chain_multiplication_memoization {
  public static int mcm(int arr[],int i,int j,int dp[][]) {
    if (i==j) {
      return 0; // single matrix case
    }
    if (dp[i][j]!=-1) {
      return dp[i][j];
    }
    int ans=Integer.MAX_VALUE;
    for (int k=i; k<=j-1;k++) {
       int cost1=mcm(arr,i,k,dp);// Ai....Ak =>arr[i-1] X arr[k]
       int cost2=mcm(arr,k+1,j,dp); // Ai+1...Aj => arr[k] X arr[j]
       int cost3=arr[i-1] * arr[k]*arr[j];
       int finalCost=cost1+cost2+cost3;
       ans=Math.min(ans,finalCost);
    }  
    return dp[i][j]=ans; // MinCost
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
    int dp[][]=new int[n+1][n+1];
    for (int i=0;i<=n;i++) {
      Arrays.fill(dp[i],-1);
    }
    System.out.println("The minimum cost for matrix chain multiplication is:"+mcm(arr,1,n,dp));
    sc.close();
  }
}
