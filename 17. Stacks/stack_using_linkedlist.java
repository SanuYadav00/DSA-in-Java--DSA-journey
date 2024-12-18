import java.util.*;
public class stack_using_linkedlist {
  static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data=data;
      this.next=null;
    }  
  }
  static Node head;
 public  boolean isEmpty() {
      return head==null;
    } 
    public  void push(int data) {
      Node newnode=new Node(data);
      if (isEmpty()) {
        head=newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
    }
    public  int pop() {
      if (isEmpty()) {
        System.out.println("The stack is empty.");
        return -1;
      }
      int data=head.data;
      head=head.next;
      return data;
    }

    public  int peek() {
      if (isEmpty()) {
        System.out.println("The stack is empty.");
        return -1;
      }
      return head.data;
    }
  
  public static void main(String args[]) {
    stack_using_linkedlist s=new  stack_using_linkedlist();
    System.out.println("1. Push");
    System.out.println("2. Pop");
    System.out.println("3. Peek");
    System.out.println("4. Check for empty");
    System.out.println("5. Exit");
    Scanner sc=new Scanner(System.in);
    int choice;
    do{
    System.out.print("Enter your choice:");
    choice=sc.nextInt();
    switch(choice) {
      case 1:
      int data;
      System.out.print("Enter the data to push into stack:");
      data=sc.nextInt();
      s.push(data);
      break;

      case 2:
      System.out.println(s.pop()+" was popped from the stack.");
      break;

      case 3:
      System.out.println(s.peek()+" is currently top data.");
      break;

      case 4:
      System.out.println("The stack is currently empty:"+s.isEmpty());
      break;

      case 5:
      System.out.println("Exiting ....");
      break;

      default:
      System.out.println("Please enter valid option.");
    }
    } while(choice!=5);
    sc.close();
  }
}

  