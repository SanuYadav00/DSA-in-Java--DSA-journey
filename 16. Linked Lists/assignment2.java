/* Delete N Nodes After M Nodes of a Linked List
We have a linked list and two integers M and N. Traverse the linked list such that you retain M nodes
then delete next N nodes, continue the same till end of the linked list. 
Difficulty Level:Rookie.
Sample Input 1: M=2 N=2    LL: 1->2->3->4->5->6->7->8
Sample Output 1: 1->2->5->6
Sample Input 2: M=3 N=2    LL: 1->2->3->4->5->6->7->8->9->10
Sample Output 2: 1->2->3->6->7->8
 */
// Time complexity O(n)
// Space complexity O(1)
import java.util.*;

public class assignment2 {
  public static class Node {
    int data;
    Node next;
    public Node (int data) {
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;

  public  void add_at_first(int data) {
    Node newNode=new Node(data);
    size++;
    if (head==null) {
     head=tail=newNode;
     return;
    }
   newNode.next=head;
   head=newNode;
  }
  public void print() {
    if (head==null) {
      System.out.println("Linked list is empty.");
      return;
    }
    Node temp=head;
    System.out.print("The elements of the linked list are:");
    while(temp!=null) {
      System.out.print(temp.data+" -> ");
      temp=temp.next;
    } 
    System.out.println("null");
  }

  public void traverse(int m, int n) {
    Node temp=head;
    while(temp!=null ) {
      for (int i=1;i<m;i++) {
        temp=temp.next;
        if (temp==null) {
          return;
        }
      }
      Node temp1=temp;
      for (int i=0;i<n;i++) {
        temp1=temp1.next;
        if (temp1==null) {
          temp.next=temp1;
          return;
      }
      size--;
    }
      temp.next=temp1.next;
      temp=temp.next;
      //temp.next=null;
      //temp=temp1.next;

    
  }
}
  public static void main(String args[]) {
    assignment2 ll=new assignment2();
    Scanner sc=new Scanner(System.in);
    ll.add_at_first(8);
    ll.add_at_first(7);
    ll.add_at_first(6);
    ll.add_at_first(5);
    ll.add_at_first(4);
    ll.add_at_first(3);
    ll.add_at_first(2);
    ll.add_at_first(1);
    ll.print();
    System.out.println("The total nodes are:"+size);
    System.out.print("Enter the no. of nodes you want to retain(value of M):");
    int m=sc.nextInt();
    System.out.print("Enter the no. of nodes you want to skip(value of N):");
    int n=sc.nextInt();
    ll.traverse(m,n);
    ll.print();
    System.out.println("The total nodes are:"+size);
    
    sc.close();
  }
}
  

