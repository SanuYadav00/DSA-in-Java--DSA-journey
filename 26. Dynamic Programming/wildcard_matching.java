/* Given an input string (s) and a pattern (p), implement wildcard pattern matching with
 support for '?' and '*' where:
'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).
Example 1:
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

Example 2:
Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.

Example 3:
Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
  */
  // TC O(m*n)
  // SC O(m*n) due to dp array of size m*n
import java.util.*;  
public class wildcard_matching {
  public static boolean match(String str, String p) {
    int m=str.length();
    int n=p.length();
    boolean dp[][]=new boolean[m+1][n+1];
    dp[0][0]=true;
    for (int i=1;i<=m;i++) {
      dp[i][0]=false;
    }
    for (int i=1;i<=n;i++) {
      if (p.charAt(i-1)=='*') {
        dp[0][i]=dp[0][i-1];
      }
      else {
        dp[0][i]=false;
      }
    }
    for (int i=1;i<=m;i++) {
      for (int j=1;j<=n;j++) {
        char c1=str.charAt(i-1);
        char c2=p.charAt(j-1);
        // case 1
        if (c1==c2 || c2=='?') {
          dp[i][j]=dp[i-1][j-1];
        }
        // case 2
        else if (c2=='*') {
          boolean ans1=dp[i][j-1]; // we match * with empty string
          boolean ans2=dp[i-1][j]; // we match * with any string
          dp[i][j]=ans1||ans2;
        }
        else {
          dp[i][j]=false;
        }
      }
    }
    return dp[m][n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
    String str=sc.next();
    System.out.print("Enter the pattern:");
    String p=sc.next();
    System.out.println("The pattern matches the string:"+match(str,p));
    sc.close();
  } 
}
