// TC for enqueue O(1) for dequeue O(n) for peek O(1)
import java.util.*;
public class queue_using_array {
  static class Queue {
    static int arr[];
    static int size;
    static int rear;
    public Queue(int n) {
      size=n;
      arr=new int[size];
      rear=-1;
    } 
  
 public boolean isEmpty() {
      return rear==-1;
    } 
    public  void add(int data) {
      if (rear==size-1) {
        System.out.println("The Queue is full.");
        return;
      }
      rear=rear+1;
      arr[rear]=data;
    }
    public int remove() {
      if (isEmpty()) {
        System.out.println("The queue is empty.");
        return -1;
      }
      int front=arr[0];
      for (int i=0;i<rear;i++) {
        arr[i]=arr[i+1];
      }
      return front;
    }

    public  int peek() {
      if (isEmpty()) {
        System.out.println("The queue is empty.");
        return -1;
      }
      return arr[0];
    }
  }
  
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of queue:");
    int n=sc.nextInt();
    Queue q=new Queue(n);
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Peek");
    System.out.println("4. Check for empty");
    System.out.println("5. Exit");
    int choice;
    do{
    System.out.print("Enter your choice:");
    choice=sc.nextInt();
    switch(choice) {
      case 1:
      int data;
      System.out.print("Enter the data to add into queue:");
      data=sc.nextInt();
      q.add(data);
      break;

      case 2:
      System.out.println(q.remove()+" was popped from the queue.");
      break;

      case 3:
      System.out.println(q.peek()+" is currently front data.");
      break;

      case 4:
      System.out.println("The queue is currently empty:"+q.isEmpty());
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

  