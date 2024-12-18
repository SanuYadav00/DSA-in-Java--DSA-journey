/* Write a program to find the min cost to multiply matrices. The row and columns of the matrices are stored in a array */
// TC O(2^n) exponential time complexity SC O(n)
import java.util.*;
public class matrix_chain_multiplication {
  public static int mcm(int arr[],int i,int j) {
    if (i==j) {
      return 0; // single matrix case
    }
    int ans=Integer.MAX_VALUE;
    for (int k=i; k<=j-1;k++) {
       int cost1=mcm(arr,i,k);// Ai....Ak =>arr[i-1] X arr[k]
       int cost2=mcm(arr,k+1,j); // Ai+1...Aj => arr[k] X arr[j]
       int cost3=arr[i-1] * arr[k]*arr[j];
       int finalCost=cost1+cost2+cost3;
       ans=Math.min(ans,finalCost);
    }  
    return ans; // MinCost
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of matrices:");
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.print("Enter the rows and columns in sequential way:");
    for (int i=0;i<=n;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println("The minimum cost for matrix chain multiplication is:"+mcm(arr,1,n));
    sc.close();
  }
}
