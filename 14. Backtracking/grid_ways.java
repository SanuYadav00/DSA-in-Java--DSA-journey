/* Write a program to find the total number of ways to reach from (0,0) to (m-1,n-1) in a m*n grid.
 Allowed moves right or down.
 */
// TC O(2^(n+m))
import java.util.*;
public class grid_ways {
  public static int ways(int a,int b, int m, int n) {
    // if (a==m && b==n) { // for last cell
    //   return 1;
    // }
    // else if (a>m || b>n) { // boundary cross condition
    //   return 0;
    // }
    // int c1=ways(a+1,b,m,n);
    // int c2=ways(a,b+1,m,n);
    // return c1+c2;
    int ans=fact(m+n)/(fact(m)*fact(n));
    return ans;

  }
  public static int fact(int n) {
    if (n<=1) {
      return 1;
    }
    return n*fact(n-1);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the grid:");
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println("The total number of ways is:"+ways(0,0,m-1,n-1));
    sc.close();
  }
}