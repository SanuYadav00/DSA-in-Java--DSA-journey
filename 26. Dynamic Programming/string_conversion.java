/* Write a program to find the minimum no. of operations required to convert string1 to string2
 with only insertion & deletion. 
 For example: str1: abcdefg str2:aceg 3 operations
 str1:abcde str2:abcf 3 operations
  */
import java.util.*;
public class string_conversion {
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
          dp[i][j]=Math.min(add,delete);
         }
      }
    }
    return dp[m][n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String word1=sc.next();
    System.out.print("Enter second string:");
    String word2=sc.next();
    System.out.println("The minimum number of operations required to convert string1 to string2 is:"+editDistance(word1,word2,word1.length(),word2.length()));
    sc.close();
  }
}
