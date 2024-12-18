// TC for push O(1) for pop O(n) for peek O(1)
import java.util.*;
public class stack_using_2_queues {
  static class Queues {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    public boolean isEmpty() {
      return q1.isEmpty() && q2.isEmpty();
    } 
    public  void add(int data) {
      if (!q1.isEmpty()) {
        q1.add(data);
      }
      else {
        q2.add(data);
      }
    }
  
    public int remove() {
      if (isEmpty()) {
        System.out.println("The stack is empty.");
        return -1;
      }
      int top=-1;
      if (!q1.isEmpty()) {
       while (!q1.isEmpty()) {
        top=q1.remove();
        if (q1.isEmpty()) {
          break;
        }
        q2.add(top);
      }
        
      }
      else {
        while (!q2.isEmpty()) {
        top=q2.remove();
        if (q2.isEmpty()) {
          break;
        }
        q1.add(top);
      }
      }
      return top;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("The stack is empty.");
        return -1;
      }
      int top=-1;
      if (!q1.isEmpty()) {
       while (!q1.isEmpty()) {
        top=q1.remove();
        q2.add(top);
      }
    }
      else {
        while (!q2.isEmpty()) {
        top=q2.remove();
        q1.add(top);
      }
    
    }
    return top;
  }
}

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    Queues s=new Queues();
    System.out.println("1. Push");
    System.out.println("2. Pop");
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
      System.out.print("Enter the data to add into stack:");
      data=sc.nextInt();
      s.add(data);
      break;

      case 2:
      System.out.println(s.remove()+" was popped from the stack.");
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

