/* write a program to reverse the elements of a queue 
 sample input: 1 2 3 4 5 6
 output: 6 5 4 3 2 1
*/
// Time complexity O(n)
import java.util.*;
public class queue_reversal {
  public static void reverse(Queue<Integer> q) {
    Stack<Integer> s=new Stack<>();
    while (!q.isEmpty()) {
      s.push(q.remove());
    }
    while (!s.isEmpty()) {
      q.add(s.pop());
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
    reverse(q);
    System.out.print("The elements of the queue after reverse are:");
    while (!q.isEmpty()) {
      System.out.print(" "+q.remove());
    }
    System.out.println();
    sc.close();
  }
  
}

