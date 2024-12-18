import java.util.*;
public class Doubly_LL {
  public static class Node {
   int data;
   Node prev;
   Node next;
   public Node(int data) {
    this.data=data;
    this.prev=null;
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
    head.prev=newnode;
    head=newnode;
  }
  public void addLast(int data) {
    Node newnode=new Node(data);
    size++;
    if (head==null) {
      head=tail=newnode;
      
      return;
    }
    newnode.prev=tail;
    tail.next=newnode;;
    tail=newnode;
  }
  public void addMiddle(int data,int position) {
    if (position==0) {
      addFirst(data);
      return;
    }
    if (position==size) {
      addLast(data);
      return;
    }
    Node newnode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<position-1) {
      temp=temp.next;
      i++;
    }
   newnode.next=temp.next;
   temp.next.prev=newnode;
   temp.next=newnode;
   newnode.prev=temp;
   size++;
  }

  public int removeFirst() {
    if (head==null) {
      System.out.println("The linked list is empty.");
      return Integer.MIN_VALUE ;
    }
    int val=head.data;
    if (size==1) {
     head=tail=null;
     size--;
     return val;
    }
    head=head.next;
    head.prev=null;
    size--;
    return val;


  }
  public int removeLast() {
    if (head==null) {
      System.out.println("The linked list is empty.");
      return Integer.MIN_VALUE ;
    }
  
    if (size==1) {
      int val=tail.data;
     head=tail=null;
     size--;
     return val;
    }
    Node temp=head;
    while (temp.next!=null) {
      temp=temp.next;
    }
    int val=temp.data;
    temp=temp.prev;
    temp.next=null;
    tail=temp;
    size--; 
   /*  int val=tail.data;
    Node temp=tail.prev;
    temp.next=null;
    tail=temp;
    size--; */
    return val;


  }
  public int removeMiddle(int position) {
    if (position==0) {
      return removeFirst();
    }
    if (position==size-1) {
      return removeLast();
    }
    
    Node temp=head;
    int i=0;
    while(i<position-1) {
      temp=temp.next;
      i++;
    }
    int val=temp.next.data;
   temp.next=temp.next.next;
   temp.next.prev=temp;
   size--;
   return val;
  }


  public void print() {
    if (head==null) {
      System.out.println("The linked list is empty.");
      return;
    }
    System.out.println("The elements of the linked list are:");
    Node temp=head;
    while(temp!=null) {
      System.out.print(" "+temp.data+"<->");
      temp=temp.next;
    }
    System.out.println("null");

  }
  public void reverse() {
    Node prev=null;
    Node next;
    Node curr=head;
    while (curr!=null) {
      next=curr.next;
      curr.next=prev;
      curr.prev=next;
      prev=curr;
      curr=next;
    }
    head=prev;

  }

  public static void main(String args[]) {
   Doubly_LL dll=new Doubly_LL();
   System.out.println(dll.removeFirst()+" was deleted.");
   dll.print();
   System.out.println("Size of linked list is:"+size);
   dll.addFirst(5);
   System.out.println(dll.removeFirst()+" was deleted.");
   dll.addFirst(4);
   dll.addFirst(3);
   dll.addFirst(2);
   dll.addFirst(1);
   dll.print();
   System.out.println("Size of linked list is:"+size);
   System.out.println(dll.removeFirst()+" was deleted.");
   System.out.println(dll.removeFirst()+" was deleted.");
   System.out.println(dll.removeFirst()+" was deleted.");
   System.out.println(dll.removeFirst()+" was deleted.");
   dll.addFirst(4);
   dll.addFirst(3);
   dll.addFirst(2);
   dll.addFirst(1);
   dll.print();
   System.out.println("Size of linked list is:"+size);
   dll.addMiddle(10,1);
   dll.addMiddle(40,5);
   dll.print();
   System.out.println("Size of linked list is:"+size);
   System.out.println(dll.removeLast()+" was deleted.");
   dll.print();
   System.out.println("Size of linked list is:"+size);
   dll.reverse();
   dll.print();
   System.out.println("Size of linked list is:"+size);
   System.out.println(dll.removeMiddle(2)+" was deleted.");
   dll.print();
   System.out.println("Size of linked list is:"+size);
   System.out.println(dll.removeMiddle(size-1)+" was deleted.");
   dll.print();
   System.out.println("Size of linked list is:"+size);
   dll.addLast(24);
   dll.print();
   System.out.println("Size of linked list is:"+size);

  }
}
