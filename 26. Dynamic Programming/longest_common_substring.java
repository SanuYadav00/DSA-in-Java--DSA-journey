/* A substring of a string is a contigious sequence of characters within a string.
 Find the length of longest common string between two strings using tabulation
 Sample input1: str1="abcde" str2="abgce"
 ans=2 // "ab"

 Sample input2: str1="abcdgh" str2="acdghr"
 ans=4 //"cdgh"

 TC O(m*n) where m is the length of first string and n is the length of 2nd string
*/
import java.util.*;
public class longest_common_substring {
  public static int lcs(String a, String b, int m, int n) {
    int dp[][]=new int[m+1][n+1];
    for (int i=0;i<=m;i++) {
      dp[i][0]=0;
    }
    for (int i=0;i<=n;i++) {
      dp[0][i]=0;
    }
    int ans=0;
    for (int i=1;i<=m;i++) {
      for (int j=1;j<=n;j++) {
         char c1=a.charAt(i-1);
         char c2=b.charAt(j-1);
         
         if (c1==c2) {
          dp[i][j]=1+dp[i-1][j-1];
          ans=Math.max(ans,dp[i][j]);
         }
         else {
          dp[i][j]=0;
         }
      }
    }
    return ans;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String s1=sc.next();
    System.out.print("Enter second string:");
    String s2=sc.next();
    System.out.println("The length of longest common string is:"+lcs(s1,s2,s1.length(),s2.length()));
    sc.close();
  }
}
