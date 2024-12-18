/* Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 You can only perform the below three operations:
 i. Insert a character
 ii. Delete a character
 iii. Replace a character

 For eg, word1=intention word2=execution
 ans=5
 i. intention-> inention (remove t)
 ii. inention->enention (replace i with e)
 iii. enention-> exention (replace n with x)
 iv. exention->exection (replace n with c)
 v. exection-> execution (insert u) 

 TC O(m*n) where m is the length of first string and n is the length of 2nd string
 */

import java.util.*;
public class edit_distance {
  public static int editDistance(String a, String b, int m, int n) {
    int dp[][]=new int[m+1][n+1];
    for (int i=0;i<=m;i++) {
      dp[i][0]=i;
    }
    for (int i=0;i<=n;i++) {
      dp[0][i]=i;
    }
    for (int i=1;i<=m;i++) {
      for (int j=1;j<=n;j++) {
         char c1=a.charAt(i-1);
         char c2=b.charAt(j-1);
         if (c1==c2) {
          dp[i][j]=dp[i-1][j-1];
         }
         else {
          int add=1+dp[i][j-1];
          int delete=1+dp[i-1][j];
          int replace=1+dp[i-1][j-1];
          dp[i][j]=Math.min(add,Math.min(delete,replace));
         }
      }
    }
    return dp[m][n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first word:");
    String word1=sc.next();
    System.out.print("Enter second word:");
    String word2=sc.next();
    System.out.println("The minimum number of operations required to convert word1 to word2 is:"+editDistance(word1,word2,word1.length(),word2.length()));
    sc.close();
  }
}
