/* Reversing the first K elements of a Queue
We have an integer k and a queue of integers, we need to reverse the order of the first k
 elements of the queue, leaving the other elements in the same relative order.
 Sample Input 1:Q = [10, 20, 30, 40, 50, 60, 70,80, 90, 100] ,k=5
 Sample Output 1: Q = [50, 40, 30, 20, 10, 60, 70,80, 90, 100] */
 // Time Complexity O(n)
// Space Complexity O(n)
import java.util.*;
public class assignment4 {
    public static void reverse(Queue<Integer> q,int k) {
      Stack<Integer> s=new Stack<>();
      Queue<Integer> q1=new LinkedList<>();
      for (int i=0;i<k;i++) {
        s.push(q.remove());
      }
      while (!q.isEmpty()) {
      q1.add(q.remove());
      }
      while (!s.isEmpty()) {
        q.add(s.pop());
      }
      while (!q1.isEmpty()) {
        q.add(q1.remove());
      }
      return;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of queue:");
      int n=sc.nextInt();
      Queue<Integer> q=new LinkedList<>();
      System.out.print("Enter the elements of the queue:");
      for (int i=0;i<n;i++) {
        int n1=sc.nextInt();
        q.add(n1);
      }
      System.out.print("Enter the value of K:");
      int k=sc.nextInt();
      reverse(q,k);
      System.out.print("The elements of the queue after reverse of initial "+k+" elements are:");
      /* while (!q.isEmpty()) {
        System.out.print(" "+q.remove());
      } */
      System.out.println(q);
      sc.close();
    }
    
  }
  
  
