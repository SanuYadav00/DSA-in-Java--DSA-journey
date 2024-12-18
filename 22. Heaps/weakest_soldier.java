/* We are given an m*n binary matrix of 1's (soldiers) and 0's(civilians).
 The soldiers are positioned in front of the civilians. That is, all the 1's will appear
 to the left of all the 0's in each row.
 A row i is weaker than a row j if one of the following is true:
 - The number of soldiers in row i is less than the number of soldiers in row j.
 - Both rows have the same number of soldiers and i<j.
 Find the weakest rows.  
 */
import java.util.*;
public class weakest_soldier {
  static class soldier implements Comparable<soldier> {
    int no;
    int index;
    public soldier(int no,int index) {
      this.no=no;
      this.index=index;
    }
    @Override
    public int compareTo (soldier p) {
      if (this.no==p.no) {
          return this.index-p.index;
      }
      else {
      return this.no-p.no;
      }
    }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of rows:");
    int m=sc.nextInt();
    System.out.print("Enter the total no. of columns:");
    int n=sc.nextInt();
    System.out.print("Enter the value of k:");
    int k=sc.nextInt();
    int arr[]=new int[m];
    PriorityQueue<soldier> pq=new PriorityQueue<>();
    for (int i=0;i<m;i++) {
    System.out.print("Enter the values of "+i+" row:");
    int s=0;
    for (int j=0;j<n;j++) {
        arr[j]=sc.nextInt();
        if (arr[j]==1) {
          s=s+1;
        }
    }
    pq.add(new soldier(s,i));

  }
    System.out.print("The weakest "+k+" rows are:");
    for (int i=0;i<k;i++) {
      System.out.print(" R"+pq.peek().index);
      pq.remove();
    }
    System.out.println();
    sc.close();
  }
}
