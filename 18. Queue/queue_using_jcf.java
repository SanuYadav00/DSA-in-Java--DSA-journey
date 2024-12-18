// TC for enqueue O(1) for dequeue O(1) for peek O(1)
import java.util.*;
public class queue_using_jcf {
  
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    Queue<Integer> q=new LinkedList<>();
    // we could also have used Queue<Integer> q=new ArrayDeque<>();
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

