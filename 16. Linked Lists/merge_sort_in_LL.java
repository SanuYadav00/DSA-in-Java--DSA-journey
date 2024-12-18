import java.util.LinkedList;

import org.w3c.dom.Node;

import java.util.*;
// It also takes O(nlogn) time complexity
public class merge_sort_in_LL {
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
 
  private Node getMid(Node head) {
    Node slow=head;
    Node fast=head.next;
    while (fast!=null && fast.next!=null) {
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow; // mid node
  }

  private Node merge(Node head1,Node head2) {
    Node mll=new Node(-1);
    Node temp=mll;
    while (head1!=null && head2!=null) {
      if (head1.data<=head2.data) {
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
      }
      else {
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
      }
    }
    while (head1!=null) {
      temp.next=head1;
      temp=temp.next;
      head1=head1.next;
    }
    while (head2!=null) {
      temp.next=head2;
      temp=temp.next;
      head2=head2.next;
    }
    return mll.next;

  }
  public Node mergeSort(Node head) {
    if (head==null || head.next==null) {
      return head;
    }
    // find mid
     Node mid=getMid(head);
    // left & right MS
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=mergeSort(head);
    Node newRight=mergeSort(rightHead);

  // Merge
   return merge(newLeft,newRight);
  }
  public static void main(String args[]) {
  merge_sort_in_LL ll=new merge_sort_in_LL();
  ll.addFirst(5);
  ll.addFirst(15);
  ll.addFirst(20);
  ll.addFirst(37);
  ll.addFirst(514);
  ll.addFirst(23);
  ll.addFirst(6);
  System.out.println("The linked list before sorting is:");
  ll.print();
 ll.head= ll.mergeSort(ll.head);
 System.out.println("The linked list after sorting is:");
 ll.print();

  }
  
}
