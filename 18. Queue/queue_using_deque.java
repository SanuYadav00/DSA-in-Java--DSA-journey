// TC for push O(1) for pop O(1) for peek O(1)
import java.util.*;
public class queue_using_deque {
  static class queues {
    static Deque<Integer> d=new LinkedList<>();
    public boolean isEmpty() {
      return d.isEmpty();
    } 
    public  void add(int data) {
      d.addLast(data);
    }
  
    public int remove() {
      if (d.isEmpty()) {
        System.out.println("The queue is empty.");
        return -1;
      }
      return d.removeFirst();
    }

    public int peek() {
      if (d.isEmpty()) {
        System.out.println("The queue is empty.");
        return -1;
      }
      return d.getFirst();
    }
      
}

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    queues de=new queues();
    System.out.println("1. Add");
    System.out.println("2. Remove");
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
      de.add(data);
      break;

      case 2:
      System.out.println(de.remove()+" was popped from the queue.");
      break;

      case 3:
      System.out.println(de.peek()+" is currently top data.");
      break;

      case 4:
      System.out.println("The queue is currently empty:"+de.isEmpty());
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

