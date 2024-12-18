import java.util.*;
public class ZigZag_LL {
  public static class Node {
  int data;
  Node next;
  public Node(int a) {
    this.data=a;
    this.next=null;
  }
}
public static Node head;
public static Node tail;
public static int size;

public void addFirst(int data) {
  Node newnode=new Node(data);
  size++;
  if (head==null) {
    head=tail=newnode;
    return;
  }
  newnode.next=head;
  head=newnode;
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
  public static Node getMid(Node head) {
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null) {
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow;
  }
  public void zigzag(Node head) {
   // Get Mid Node
    Node mid=getMid(head);
    Node right=mid.next;
    mid.next=null;
    // reversing 2nd half
    Node prev=null;
    Node next;
    Node curr=right;
    while(curr!=null) {
     next=curr.next;
     curr.next=prev;
     prev=curr;
     curr=next;
    }
    right=prev;
    Node left=head;
    Node nextL,nextR;

    //merging
    while(left!=null && right != null) {
     nextL=left.next;
     left.next=right; 
     nextR=right.next;
     right.next=nextL;

     //update
     left=nextL;
     right=nextR;
  }
}
  public static void main(String args[]) {
  ZigZag_LL ll=new ZigZag_LL();
  ll.addFirst(5);
  ll.addFirst(15);
  ll.addFirst(20);
  ll.addFirst(37);
  ll.addFirst(514);
  ll.addFirst(23);
  //ll.addFirst(6);
  System.out.println("The linked list before sorting is:");
  ll.print();
 ll.zigzag(ll.head);
 System.out.println("The linked list after sorting is:");
 ll.print();

  }
  
}
