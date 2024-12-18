/* Intersection of Two Linked Lists
In a system there are two singly linked list. By some programming gerror, the end node of one of the 
linked lists got linked to the second list, forming an inverted Y-shaped list. Write a program to get the
 point where two linked lists merge.`We have to find the intersection part in this system. 
 
 */
// Time complexity O(m*n);
// space complexity O(1)
public class assignment_1 {
  public static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data=data;
      this.next=null;
    }

  }
  Node get_merged_point(Node head1, Node head2) {
    Node temp1=head1;
    while (temp1!=null) {
      Node temp2=head2;
      while (temp2!=null) {
        if (temp1.next==temp2.next) {
          return temp1.next;
        }
        temp2=temp2.next;
      }
      temp1=temp1.next;
    }
    return null;
  }
  public static void main(String args[]) {
    assignment_1 ll=new assignment_1();
    Node head1=new Node(4);
    Node head2=new Node(1);
    Node newnode1=new Node(5);
    Node newnode2=new Node(6);
    Node newnode3=new Node(7);
    Node newnode4=new Node(2);
    Node newnode5=new Node(3);
    Node newnode6=new Node(10);
    head1.next=newnode1;
    newnode1.next=newnode2;
    newnode2.next=newnode3;
    head2.next=newnode4;
    newnode4.next=newnode5;
    newnode5.next=newnode2;
    newnode3.next=newnode6;
    Node point=ll.get_merged_point(head1,head2);
    if (point==null) {
      System.out.println("The given two linked lists don't merge with each other.");
    }
    else {
    System.out.println("The intersection parts are:");
     while (point!=null) {
      System.out.print(" "+point.data+"->");
      point=point.next;
     }
     System.out.println("null");
    }





  }
  
}
