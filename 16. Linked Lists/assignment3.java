/* Swapping Nodes in a Linked List
We have a linked list and two keys in it , swap nodes for two given keys. 
Nodes should be swapped by changing links.
Swapping data of nodes may be expensive in many situations when data contains many fields. 
It may be assumed that all keys in the linked list are distinct.
Sample Input 1: 1->2->3->4,  x = 2, y = 4
Sample Output 1: 1->4->3->2 */
// Time complexity O(n)
  // Space complexity O(1)
  import java.util.*;
  public class assignment3 { 
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
  
    public void swap(int key1, int key2) {
      if (key1==key2) {
        return;
      }
      Node prev1=null;
      Node curr1=head;
      while(curr1!=null && curr1.data!=key1 ) {
      prev1=curr1;
      curr1=curr1.next;  
      }
      Node prev2=null;
      Node curr2=head;
      while(curr2!=null && curr2.data!=key2 ) {
      prev2=curr2;
      curr2=curr2.next;  
      }
      if (curr1==null || curr2==null) {
        return;
      }
      if (prev1!=null) {
        prev1.next=curr2;
      }
      else {
        head=curr2;
      }
      if (prev2!=null) {
        prev2.next=curr1;
      }
      else {
        head=curr1;
      }
      Node t=curr2.next;
      curr2.next=curr1.next;
      curr1.next=t;
  }
    public static void main(String args[]) {
      assignment3 ll=new assignment3();
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
      System.out.print("Enter the first key which you want to swap:");
      int key1=sc.nextInt();
      System.out.print("Enter the second key which you want to swap:");
      int key2=sc.nextInt();
      ll.swap(key1,key2);
      ll.print();
      System.out.println("The total nodes are:"+size);
      
      sc.close();
    }
  }
    
  
  
  


