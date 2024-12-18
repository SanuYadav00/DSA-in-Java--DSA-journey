/* Write a program to find the min no. of jumps we need to go to the last element of the array from the starting index.
 The maximum places we can jump from the index of a array is the value stored at that index.
 Input: int arr[]={2,3,1,1,4}
 ans: min jumps:2
  */
import java.util.*;
public class min_array_jumps {
  public static int find(int arr[]) {
    int n=arr.length;
    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    dp[n-1]=0;
    for (int i=n-2;i>=0;i--) {
      int steps=arr[i];
      int ans=Integer.MAX_VALUE;
      for (int j=i+1;j<=i+steps && j<n;j++) {
        if (dp[j]!=-1)  {
        ans=Math.min(ans,1+dp[j]);
        }
      }
      if (ans!=Integer.MAX_VALUE) {
        dp[i]=ans;
      }
    }
    return dp[0];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter total no. of elements in the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the elements of the array:");
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println("The minimum jumps required to go from starting index to final index is:"+find(arr));
    sc.close();
  }
}
