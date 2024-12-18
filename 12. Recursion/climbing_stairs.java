/* Write a program to count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time */
// O(2^n)
import java.util.*;
public class climbing_stairs {
  public static int count (int n) {
    if (n==0) {
      return 1;
    }
    if (n<0) {
      return 0;
    }
    return count(n-1)+count(n-2);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    int a=count(n);
    System.out.println("The total ways to reach "+n+"th stair is:"+a);
    sc.close();
  }
}