/* A subsequence of a string is a new string generated from the original string with
 some characters (can be none) deleted without changing the relative order of the 
 remaining characters. Find the length of longest common subsequence between two strings using tabulation
 Sample input1: str1="abcde" str2="ace"
 ans=3 // "ace"

 Sample input2: str1="abcdge" str2="abedg"
 ans=4 //"abdg"

 TC O(m*n) where m is the length of first string and n is the length of 2nd string
*/
import java.util.*;
public class longest_common_subsequence_tabulation {
  public static int lcs(String a, String b, int m, int n) {
    int dp[][]=new int[m+1][n+1];
    for (int i=0;i<=m;i++) {
      dp[i][0]=0;
    }
    for (int i=0;i<=n;i++) {
      dp[0][i]=0;
    }
    for (int i=1;i<=m;i++) {
      for (int j=1;j<=n;j++) {
         char c1=a.charAt(i-1);
         char c2=b.charAt(j-1);
         if (c1==c2) {
          dp[i][j]=1+dp[i-1][j-1];
         }
         else {
          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
         }
      }
    }
    for (int i=0;i<dp.length;i++) {
      for (int j=0;j<dp[0].length;j++) {
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
    return dp[m][n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String s1=sc.next();
    System.out.print("Enter second string:");
    String s2=sc.next();
    System.out.println("The length of longest common subsequence is:"+lcs(s1,s2,s1.length(),s2.length()));
    sc.close();
  }
}
