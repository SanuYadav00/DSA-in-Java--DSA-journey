/* Given a number array, find the minimum possible absolute difference between the sum of two partitions of the
 array.
 // Also called minimum subset difference or partitioning subsets
 // variation of 0-1 knapsack
 Input: numbers[]={1,6,11,5}
 output: min diff=1
  */
  // Tc O(n*w)
import java.util.*;  
public class minimum_partitioning {
  public static int find(int arr[]) {
    int n=arr.length;
    int sum=0;
    for (int i=0;i<n;i++) {
      sum+=arr[i];
    }
    int w=sum/2; // weight
    int dp[][]=new int[n+1][w+1];
    for (int i=1;i<n+1;i++) {
      for (int j=1;j<w+1;j++) {
        if (arr[i-1]<=j) { // valid
          dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
        }
        else {
          dp[i][j]=dp[i-1][j];
        }
      }
    }
    int sum1=dp[n][w];
    int sum2=sum-sum1;
    return Math.abs(sum1-sum2);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter array elements:");
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println("The minimum difference between the partitions is:"+find(arr));
    sc.close();
  }
}
