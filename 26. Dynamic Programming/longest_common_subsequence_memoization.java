/* A subsequence of a string is a new string generated from the original string with
 some characters (can be none) deleted without changing the relative order of the 
 remaining characters. Find the length of longest common subsequence between two strings using memoization
 Sample input1: str1="abcde" str2="ace"
 ans=3 // "ace"

 Sample input2: str1="abcdge" str2="abedg"
 ans=4 //"abdg"

 TC O(m*n) where m is the length of first string and n is the length of 2nd string
*/
import java.util.*;
public class longest_common_subsequence_memoization {
  public static int lcs(String a, String b, int m, int n,int dp[][]) {
    if (m==0 || n==0 ) {
      return 0;
    }
    if (dp[m][n]!=-1) {
      return dp[m][n];
    }
    if (a.charAt(m-1)==b.charAt(n-1)) { // same
      dp[m][n]=1+lcs(a,b,m-1,n-1,dp);
      return dp[m][n];
    }
    else { // diff
      int l1=lcs(a,b,m-1,n,dp);
      int l2=lcs(a,b,m,n-1,dp);
      dp[m][n]=Math.max(l1,l2);
      return dp[m][n];
    }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String s1=sc.next();
    System.out.print("Enter second string:");
    String s2=sc.next();
    int dp[][]=new int[s1.length()+1][s2.length()+1];
    for (int i=0;i<=s1.length();i++) {
      for (int j=0;j<=s2.length();j++) {
        dp[i][j]=-1;
      }
    }
    System.out.println("The length of longest common subsequence is:"+lcs(s1,s2,s1.length(),s2.length(),dp));
    sc.close();
  }
}
