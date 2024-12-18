/* Write a program to create a linked list , add at first , add at 
 last and print the linked list
  */
// Time complexity for add at first = O(1)
// Time complexity for add at last = O(1)
// Time complexity for print = O(n) where n is the total no of elements in the linked list
// Time complexity for adding in middle = O(n) , linking takes constant time but finding the position to insert takes linear time
// // Time complexity for iterative_search= O(n)
// Time complexity for recursive_search= O(n) , Sc=O(n) due to call stack
// time complexity for reverse=O(n)
import java.util.*;
public class LinkedList {
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

  public void add_at_last(int data) {
    // Creating a new node
    Node newNode=new Node(data);
    size++;
    if (head==null) {
     head=tail=newNode;
     return;
    }
  // linking the newnode with tail
   tail.next=newNode;
   // making the new node as tail
   tail=newNode;
  }

  public void add_at_middle(int index, int data) {
    if (index==0) {
      add_at_first(data);
      return;
     }
    // Creating a new node
    Node newNode=new Node(data);
    size++;
    int i=0;
  Node temp=head;
  while (i<index-1) {
    temp=temp.next;
    i++;
  }
   newNode.next=temp.next;
   temp.next=newNode;
  }
  
  public void remove_first() {
    if (head==null) {
      System.out.println("Linked list is empty.");
      return ;
    }
    else if (size==1) {
      int val=head.data;
      head=tail=null;
      System.out.println(val+" was removed from the linked list.");
      size=0;
      return;
  }
    
    int val=head.data;
    /* Node temp=head;
    head=temp.next; */
    head=head.next;
    size--;
    System.out.println(val+" was removed from the linked list.");
  }
  public void remove_last() {
    if (head==null) {
      System.out.println("Linked list is empty.");
      return;
    }
    else if (size==1) {
      int val=head.data;
      head=tail=null;
      System.out.println(val+" was removed from the linked list.");
      size=0;
      return;
  }
    Node temp=head;
    while (temp.next!=tail) {
    temp=temp.next;
  }
  /* 
   for (int i=0;i<size-2;i++) {
    temp=temp.next;
   }
   */
  int val=temp.next.data; // tail.data
  temp.next=tail.next; // temp.next=null;
  tail=temp;
  System.out.println(val+" was removed from the linked list.");
  size--;
}

  public void delete_nth_node_from_end(int i) {
    // i is the position of that value from tail
    if (size<i) {
      System.out.println("Invalid Input.");
      return;
    }
    if (i==size) {
      head=head.next;
      return;
    }
    int n=size-i+1; // position of that value from head 
    Node temp=head;
    int j=1;
    while (j<n-1) {
      temp=temp.next;
      j++;
    }
    // now the node which we had to delete is located at temp.next
     temp.next=temp.next.next;
     return;
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

  public int iterative_search(int key) {
    if (head==null) {
      System.out.println("Linked list is empty.");
      return -1;
    }
    Node temp=head;
    int position=0;
    while(temp!=null) {
      if (temp.data==key) {
        return position;
      }
      temp=temp.next;
      position++;
    }
    return -1;
  }

  public static int recursive_search(Node temp, int key,int position) {
    if (temp==null) {
      return -1;
    }
    if (temp.data==key) {
       return position;
    }
    return recursive_search(temp.next,key,position+1);
  }
 
   public void reverse () {
    Node prev=null;
    Node curr=tail=head; // value of head will be assigned to tail and then curr
    Node next;
    while (curr!=null) {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
   }


  public static void main(String args[]) {
   LinkedList ll=new LinkedList();
   Scanner sc=new Scanner(System.in);
   ll.print();
   ll.add_at_first(3);
   ll.add_at_first(2);
   ll.add_at_first(1);
   ll.print();
   ll.add_at_last(4);
   ll.add_at_last(5);
   ll.print();
   ll.add_at_middle(2,10);
   ll.add_at_middle(5,11);
   ll.print();
   System.out.println("The total nodes are:"+size);
   /* 
   ll.remove_first();
   ll.print();
   ll.remove_last();
   ll.print();
   System.out.println("The total nodes are:"+size);
   ll.remove_first();
   ll.print();
   ll.remove_last();
   ll.print();
   System.out.println("The total nodes are:"+size); 
   System.out.print("Enter the key which you want to search:");
   int key=sc.nextInt();
   int position= ll.iterative_search(key); // if we defined the function by public static
   // int iterative_search, then we would call the function by iterative_search.No need to
   // write ll.iterative_search
   if (position!=-1) {
    System.out.println("The key was found at index :"+position);
   }
   else {
    System.out.println("The key is not present in the linked list.");
   } 
   System.out.print("Enter the key which you want to search:");
   int key1=sc.nextInt();
   Node temp=head;
   int position1= recursive_search(temp,key1,0);
   if (position1!=-1) {
    System.out.println("The key was found at index :"+position1);
   }
   else {
    System.out.println("The key is not present in the linked list.");
   }
   ll.reverse();
   ll.print(); */
   System.out.print("Which ith node from last do you want to delete:");
   int ith_from_last=sc.nextInt();
   ll.delete_nth_node_from_end(ith_from_last);
   ll.print();

   sc.close();

  }
}