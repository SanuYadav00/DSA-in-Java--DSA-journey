/* Given a array of numbers, find the total no. of subsets which give the target sum
 Use tabulation
 For example: numbers[]=4,2,7,1,3
 Target sum=10
 Output=3 {(7,3),(7,2,1),(4,3,2,1) }   
 */
// Time Complexity O(n*sum) where n=no. of numbers in array and sum=target sum
// Space Complexity
import java.util.*;
public class target_sum_subset_tabulation {
      public static void maximum(int arr[],int n,int t) {
        boolean dp[][]=new boolean[n+1][t+1];
        for (int i=0;i<=n;i++) {
              for (int j=0;j<=t;j++) {
                   if (j==0) {
                    dp[i][j]=true;
                   }
                   else {
                    dp[i][j]=false;
                   }
              }
        }

      for (int i=1;i<dp.length;i++) { // no. of numbers
        for (int j=1;j<dp[0].length;j++) { // target sum
           int no=arr[i-1]; // ith number
           // include
           if (no<=j && dp[i-1][j-no]==true) {
            dp[i][j]=true;
           }
           // include
           else if (dp[i-1][j]==true) {
            dp[i][j]=true;
           }
        }
      }

      System.out.println("The target sum is achieved by subsets:"+dp[n][t]);
      print(dp);
      }

      public static void print(boolean dp[][]) {
        System.out.println("The elements of dp are:");
            for (int i=0;i<dp.length;i++) {
                  for (int j=0;j<dp[0].length;j++) {
                        System.out.print(dp[i][j]+" ");
                  }
                  System.out.println();
            }
            System.out.println();
          }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of numbers:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter all the numbers:");
            for (int i=0;i<n;i++) {
                  arr[i]=sc.nextInt();
            }
            System.out.print("Enter the target sum:");
            int target=sc.nextInt();
            maximum(arr,n,target);
            sc.close();

      }
}