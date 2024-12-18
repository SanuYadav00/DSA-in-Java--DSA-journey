/* write a program to interleave 2 halves of a queue (even length) 
 sample input: 1 2 3 4 5 6
 output: 1 4 2 5 3 6
*/
// Time complexity O(n)
import java.util.*;
public class interleave_2_halves_of_a_queue {
  public static void interleave(Queue<Integer> q) {
    int a=q.size()/2;
    Queue<Integer> q1=new LinkedList<>();
    for (int i=0;i<a;i++) {
      q1.add(q.remove());
    }
    while (!q1.isEmpty()) {
      q.add(q1.remove());
      q.add(q.remove());
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
    interleave(q);
    System.out.print("The elements of the queue after interleavings are:");
    while (!q.isEmpty()) {
      System.out.print(" "+q.remove());
    }
    System.out.println();
    sc.close();
  }
  
}
