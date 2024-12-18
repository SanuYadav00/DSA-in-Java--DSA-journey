/* Write a program to find maximum of all subarrays of size k */
// O(nlogk)
// add and remove in pq takes O(logn) time
import java.util.*;
public class sliding_window_maximum {
  static class window implements Comparable<window> {
    int value;
    int index;
    public window(int value,int index) {
      this.value=value;
      this.index=index;
    }
    @Override
    public int compareTo (window p) {
      // for ascending order return this.value-p.value;
      return p.value-this.value; // for descending
      }
    }
  
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of elements in the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the value of k:");
    int k=sc.nextInt();
    System.out.print("Enter the array elements:");
    for (int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
    }
    PriorityQueue<window> pq=new PriorityQueue<>();
    for (int i=0;i<k;i++) {
        pq.add(new window(arr[i],i));
    }
    int result[]=new int[n-k+1];
    result[0]=pq.peek().value;
    for (int i=k;i<n;i++) {
      while (pq.size()>0 && pq.peek().index<=(i-k)) {
        pq.remove();
      }
      pq.add(new window(arr[i],i));
      result[i-k+1]=pq.peek().value;
    }
    System.out.print("The maximum of all subarrays of size "+k+" are:");
    for (int i=0;i<result.length;i++) {
      System.out.print(" "+result[i]);
    }
    System.out.println();
    sc.close();
  }
}

