/* A subsequence of a string is a new string generated from the original string with
 some characters (can be none) deleted without changing the relative order of the 
 remaining characters. Find the length of longest increasing subsequence of a array using tabulation
 Sample input1: arr[]={50,3,10,7,40,80}
 ans=4 // 3 10 40 80 or 3 7 40 80

 TC O(n*n) where n is the length of the array */
import java.util.*;
public class longest_increasing_subsequence {

  public static int lis(int arr[]) {
    int n=arr.length;
    HashSet<Integer> set=new HashSet<>();
    for (int i=0;i<n;i++) {
      set.add(arr[i]);
    }
    int m=set.size();
    int a[]=new int[m];
    int idx=0;
    for (int num:set) {
       a[idx++]=num;
    }
    Arrays.sort(a);
    int dp[][]=new int[n+1][m+1];
    for (int i=0;i<=n;i++) {
      dp[i][0]=0;
    }
    for (int i=0;i<=m;i++) {
      dp[0][i]=0;
    }

    for (int i=1;i<=n;i++) {
      for (int j=1;j<=m;j++) {
        int n1=arr[i-1];
        int n2=a[j-1];
        if (n1==n2) {
          dp[i][j]=1+dp[i-1][j-1];
        }
        else {
          dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        }
      }
    }
    return dp[n][m];
  }
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the size of the array:");
   int n=sc.nextInt();
   int arr[]=new int[n];
   System.out.print("Enter the elements of the array:");
   for (int i=0;i<n;i++) {
    arr[i]=sc.nextInt();
   }
   System.out.println("The length of longest increasing subsequence is:"+lis(arr));
   sc.close();
  }
}
