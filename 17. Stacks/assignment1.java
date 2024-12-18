/*
Palindrome Linked List
We have a singly linked list of characters, write a function that returns true if the 
given list is a palindrome, else false
Input: A->B->C->B->A
Output: Yes It is Palindrome */
// TC O(n)
// SC O(n) extra stack was created

import java.util.*;
public class assignment1 {
  public static class Node{
    char data;
    Node next;
    public Node(char data) {
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static void addLast(char data) {
    Node newnode=new Node(data);
    if(head==null) {
      head=tail=newnode;
      return;
    }
    else {
      tail.next=newnode;
      tail=newnode;
    }

  }

  public static boolean check() {
    Stack<Character> s=new Stack<>();
    Node temp=head;
    while(temp!=null) {
      s.push(temp.data);
      temp=temp.next;
    }
   Node tem=head;
    while(tem!=null) {
      char c=s.pop();
      if(tem.data!=c) {
        return false;
      }
      tem=tem.next;
    }
    return true;

  }
public static void main(String args[]) {
  
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the total no. of nodes in the list:");
  int n=sc.nextInt();
  for (int i=0;i<n;i++) {
    System.out.print("Enter the character which you want to insert in the Linked List:");
    char c=sc.next().charAt(0);
    addLast(c);
  }
  System.out.print("The linked list is Palindrome:"+check());
  sc.close();
}

}
