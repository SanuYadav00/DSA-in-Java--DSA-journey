/* Write a program to find fibonacci sequence using dynamic programming and by using memoization*/
// TC O(n)
// without dp O(2^n)
import java.util.*;
public class fibonacci_memoization {
  public static int find(int n, int arr[]) {
    if (n==0 || n==1) {
      return n;
    }
    if (arr[n]!=0) {
      return arr[n];
    }

    arr[n]=find(n-1, arr)+find(n-2,arr);
    return arr[n];
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    int a=find(n,arr);
    System.out.println("The nth sequence is:"+a);
    sc.close();
  }
}