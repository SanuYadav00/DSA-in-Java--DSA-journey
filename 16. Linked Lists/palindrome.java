/* Write a program to check if a linked list is palindrome or not */


public class palindrome {
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
    // Creating a new node
    Node newNode=new Node(data);
    size++;
    if (head==null) {
     head=tail=newNode;
     return;
    }
  // linking the newnode with head
   newNode.next=head;
   // making the new node as head
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

  public Node findMid() {
    // using slow fast approach
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
    slow=slow.next;
    fast=fast.next.next;
    }
    return slow; // slow is my mid_node

  }

  public boolean checkPalindrome() {
    if (head==null || head.next==null) {
      return true;
    }
    // step-1 find mid
    Node midNode=findMid();
    // step-2 reverse 2nd half
    Node prev=null;
    Node next;
    Node curr=midNode;
    while (curr!=null) {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    Node right=prev;
    Node left=head;
    
    // step-3 check if 1st half== 2nd half
    while (right!=null) {
      if (left.data!=right.data) {
        return false;
      }
      left=left.next;
      right=right.next;
    }
    return true;
  }

  public static void main(String args[]) {
    palindrome ll=new palindrome();
    ll.print();
    ll.add_at_first(1);
    ll.add_at_first(2);
    ll.add_at_first(3);
    ll.add_at_first(3);
    ll.add_at_first(2);
    ll.add_at_first(1);
    ll.print();
    System.out.println("The total nodes are:"+size);
    boolean a= ll.checkPalindrome();
    System.out.println("The given linked list is palindrome:"+a);

  }
}