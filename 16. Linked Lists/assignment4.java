/* Odd Even Linked List
We have a Linked List of integers, write a function to modify the linked list such that all even numbers 
appear before all the odd numbers in the modified linked list. Also, keep the order of even and odd
 numbers same.
 Sample Input 1: 8->12->10->5->4->1->6->NULL
 Sample Output 1: 8->12->10->4->6->5->1->NULL
 Sample Input 2: 1->3->5->7->NULL
 Sample Output 2:1->3->5->7->NULL */
 // Time Complexity  : o(n)
 // Space Complexity: o(1
 import java.util.*;

 
 import org.w3c.dom.Node;
public class assignment4 {
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
    
     /*  public void modify() {
        Node head1=head;
        while (head1!=null) {
        Node temp=head1;
        Node prev1=null;
        Node curr1=head1;
        Node prev2=null;
        Node curr2=head1;
        while(temp!=null) {
          if ((temp.data%2)==1) {
             curr1=temp;
             break;
          }
          prev1=temp;
          temp=temp.next;
        }
        if (curr1!=temp) {
          break;
        }
        prev2=temp;
        while (temp!=null) {
           if((temp.data%2)==0) {
              curr2=temp;
              break;
           }
           prev2=temp;
           temp=temp.next;
        }
        if (curr2!=head1) {
          if (prev1==null) {
            head=curr2;
            prev2.next=curr1;
            Node t=curr1.next;
            curr1.next=curr2.next;
            curr2.next=t;
          }
          else {
            prev1.next=curr2;
            prev2.next=curr1;
            Node t=curr1.next;
            curr1.next=curr2.next;
            curr2.next=t;
          }
        }
        head1=head1.next;
      }
    } */
    public void modify() {
       Node end = head;
       Node prev = null;
       Node curr = head;
       while (end.next != null) {
        end = end.next;
       }
       Node new_end = end;
       while (curr.data %2 !=0 && curr != end){
        new_end.next = curr;
        curr = curr.next;
        new_end.next.next = null;
        new_end = new_end.next;
      }
      if (curr.data %2 ==0){
        head = curr;
        while (curr != end){
          if (curr.data % 2 == 0){
            prev = curr;
            curr = curr.next;
          }
          else {
            prev.next = curr.next;
            curr.next = null;
            new_end.next = curr;
            new_end = curr;
            curr = prev.next;
          }
        }
      }
      else {
        prev = curr;
      }
      if (new_end != end && end.data %2 != 0){
        prev.next = end.next;
        end.next = null;
        new_end.next = end;
            }
          }

      public static void main(String args[]) {
        assignment4 ll=new assignment4();
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
        ll.modify();
        ll.print();
        System.out.println("The total nodes are:"+size);
        
        sc.close();
      }
    }
      
  
