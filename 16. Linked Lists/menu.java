import java.util.*;
 class LinkedList {
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

public void add_at_beginning(int data) {
  Node newnode=new Node(data);
  size++;
  if (head==null) {
    head=tail=newnode;
    return;
  }
  newnode.next=head;
  head=newnode;
}
public void add_at_end(int data) {
  Node newnode=new Node(data);
  size++;
  if (head==null) {
    head=tail=newnode;
    return;
  }
  tail.next=newnode;
  tail=newnode;
}
public void add_at_middle(int data,int index) {
  if (index==0) {
    add_at_beginning(data);
    return;
  }
  Node newnode=new Node(data);
  size++;
  Node temp=head;
  int i=1;
  while (i<index) {
   temp=temp.next;
   i++;
  }
  newnode.next=temp.next;
  temp.next=newnode;

}

public void remove_at_beginning() {
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
int val=temp.next.data; // tail.data
temp.next=tail.next; // temp.next=null;
tail=temp;
System.out.println(val+" was removed from the linked list.");
size--;
}

public void delete_nth_node_from_end(int i) {
  if (size<i) {
    System.out.println("Invalid Input.");
    return;
  }
  if (i==size) {
    head=head.next;
    return;
  }
  int n=size-i+1;
  Node temp=head;
  int j=1;
  while (j<n-1) {
    temp=temp.next;
    j++;
  }
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



}
public class menu {
  public static void main(String args[]) {
    LinkedList list=new LinkedList();
    Scanner sc=new Scanner(System.in);
    System.out.println("---MENU OF OPERATIONS---");
    System.out.println("1. Insert at beginning");
    System.out.println("2. Insert at end");
    System.out.println("3. Insert at any position");
    System.out.println("4. Delete from beginning");
    System.out.println("5. Delete from end");
    System.out.println("6. Delete from any position from end");
    System.out.println("7. Display");
    System.out.println("8. Iterative Search");
    System.out.println("9. Recursive Search");
    System.out.println("10. Reverse the list");
    System.out.println("11. Exit");

    int choice;
  do {
    System.out.print("Enter your choice:");
    choice=sc.nextInt();
    switch(choice) {
      case 1:
      System.out.print("Enter the element to add:");
      int element=sc.nextInt();
      list.add_at_beginning(element);
      break;

      case 2:
      System.out.print("Enter the element to add:");
      int element1=sc.nextInt();
      list.add_at_end(element1);
      break;

      case 3:
      System.out.print("Enter the element to add:");
      int element2=sc.nextInt();
      System.out.print("Enter the position to add:");
      int position=sc.nextInt();
      list.add_at_middle(element2,position);
      break; 

      case 4:
      list.remove_at_beginning();
      break;

      case 5:
      list.remove_last();
      break;

      case 6:
      System.out.print("Enter the position to add:");
      int position1=sc.nextInt();
      list.delete_nth_node_from_end(position1);
      break;

      case 7:
      list.print();
      break;

      case 8:
      System.out.print("Enter the key to find:");
      int key=sc.nextInt();
      int result1=list.iterative_search(key);
      if (result1!=-1) {
        System.out.println("The key was found at position "+result1);
      }
      else {
        System.out.println("The key is not present in the linked list.");
      }
      break;

      

      case 10: 
      list.reverse();
      System.out.println("The linked list has been Reversed:");
      break;

      case 11:
      System.out.println("EXITING.....");
      break;

      default:
      System.out.print("Please enter a valid option:");
      break;


    }

  } while (choice!=11);
  sc.close();
  }
  
}
