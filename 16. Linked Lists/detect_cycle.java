import java.util.*;

import org.w3c.dom.Node;
public class detect_cycle  {
   static class node {
    int data;
    node next;
    public node(int data) {
      this.data=data;
      this.next=null;
    }
  }
  public static node head;
  public static node tail;
  public static boolean check_cycle() { //floyd's cycle finding algorithm
    node slow=head;
    node fast=head;
    while(fast!=null && fast.next!=null) {
      slow=slow.next;
      fast=fast.next.next;
      if (slow==fast) {
        return true;
      }

    }
    return false;
  }

  public static void remove_cycle() {
    // detect cycle 
    node slow=head;
    node fast=head;
    while (fast!=null && fast.next!=null) {
      slow=slow.next;
      fast=fast.next.next;
      if (slow==fast) {
        break;
      }
    }

    // find meeting point
    slow=head;
    node prev=null;
    while(slow!=fast) {
      prev=fast;
      slow=slow.next;
      fast=fast.next;
    }

    // remove cycle
    prev.next=null;
  }

  public static void print() {
    if (head==null) {
      System.out.println("Linked list is empty.");
      return;
    }
    node temp=head;
    System.out.print("The elements of the linked list are:");
    while(temp!=null) {
      System.out.print(temp.data+" -> ");
      temp=temp.next;
    } 
    System.out.println("null");
  }

  public static void main(String args[]) {
  detect_cycle ll=new detect_cycle();
  head=new node(1);
  node temp=new node(2);
  head.next=temp;
  head.next.next=new node(3);
  head.next.next.next=new node(4);
  head.next.next.next.next=new node(5);
  head.next.next.next.next.next=temp;
  boolean result=check_cycle();
  if (result==false) { 
  System.out.println("There is a cycle in this linked List:"+result);
  print();
  }
  else {
    System.out.println("There is a cycle in this linked List:"+result);
    remove_cycle();
    print();
  }


  }
}
