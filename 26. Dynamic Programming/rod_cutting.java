/* Given a rod of length n inches and an array of prices that includes prices of all pieces of size
 smaller than n. Determine maximum value obtainable by cutting up the rod and selling all the pieces.
 Sample input: length=1 2 3 4 5 6 7 8
 price=1 5 8 9 10 17 17 20
 rodLength

 // TC O(n*L) where n is the no. of pieces of rod and L is the length of the rod
 */
import java.util.*;
public class rod_cutting {
  public static void maximum(int L, int n, int length[],int price[]) {
    int dp[][]=new int[n+1][L+1];
    for (int i=0;i<n+1;i++) {
      dp[i][0]=0;
    }
    for (int j=0;j<L+1;j++) {
      dp[0][j]=0;
    }

    for (int i=1;i<n+1;i++) { // no. of pieces of rod
      for (int j=1;j<L+1;j++) { // length of the rod
        int p=price[i-1];
        int l=length[i-1];

        if (l<=j) { // valid
          int value1=p+dp[i][j-l];
          int value2=dp[i-1][j];
          dp[i][j]=Math.max(value1,value2);
        }
        else { // invalid
          dp[i][j]=dp[i-1][j];
        }
      }
    } 
    System.out.println("The maximum obtainable value is:"+dp[n][L]);
    System.out.println("The elements of dp are:");
    for (int i=0;i<dp.length;i++) {
      for (int j=0;j<dp[0].length;j++) {
            System.out.print(dp[i][j]+" ");
      }
      System.out.println();
}
System.out.println();
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the rod:");
    int L=sc.nextInt();
    System.out.print("Enter the total no. of different piece sizes of the rod:");
    int n=sc.nextInt();
    int length[]=new int[n];
    int price[]=new int[n];
    System.out.print("Enter the length of different pieces:");
    for (int i=0;i<n;i++) {
      length[i]=sc.nextInt();
    }
    System.out.print("Enter the price of different pieces:");
    for (int i=0;i<n;i++) {
      price[i]=sc.nextInt();
    }
    maximum(L,n,length,price);
    sc.close();
  }
}
