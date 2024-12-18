// TC for enqueue O(n) for dequeue O(1) for peek O(1)
import java.util.*;
public class queue_using_2_stacks {
  static class Stacks {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public boolean isEmpty() {
      return s1.isEmpty();
    } 
    public  void add(int data) {
        while (!s1.isEmpty()) {
        s2.push(s1.pop());
    }
        s1.push(data);
        while (!s2.isEmpty()) {
          s1.push(s2.pop());
      }
    }
  
    public int remove() {
      if (isEmpty()) {
        System.out.println("The queue is empty.");
        return -1;
      }
      return s1.pop();
      
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("The queue is empty.");
        return -1;
      }
      return s1.peek();
    }
  }

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    Stacks s=new Stacks();
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
      s.add(data);
      break;

      case 2:
      System.out.println(s.remove()+" was popped from the queue.");
      break;

      case 3:
      System.out.println(s.peek()+" is currently front data.");
      break;

      case 4:
      System.out.println("The queue is currently empty:"+s.isEmpty());
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

