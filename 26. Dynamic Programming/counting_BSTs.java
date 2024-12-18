/* Write a program to find total no. of BSTs possible with given n nodes
// It is also a variation of catalan number
n=3(10,20,30)
ans=5
 */
// It is also a variation of catalan number problem
// TC (n^n)
// SC O(n) due to extra array dp
import java.util.*;
public class counting_BSTs {
  public static int  countBST (int n) {
     int dp[]=new int[n+1];
     dp[0]=1;
     dp[1]=1;
     for (int i=2;i<=n;i++) {
      for (int j=0;j<i;j++) {
        int left=dp[j]; // BSTs possible in left side
        int right=dp[i-j-1]; // BSTs possible in right side
        dp[i]+=left*right;
      }
     }
    return dp[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of nodes in the tree:");
    int n=sc.nextInt();
    System.out.println("The total number of BSTs possible in a tree with  "+n+" nodes is:"+countBST(n));
    sc.close();
  }
}
