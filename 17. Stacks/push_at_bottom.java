import java.util.*;
public class push_at_bottom {
 
  public static void pushBottom(Stack<Integer> s,int data) {
    // Time complexity=O(n);
    // Space complexity=O(1)
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int d=s.pop();
    pushBottom(s,data);
    s.push(d);
  }
  public static void main(String args[]) {
    Stack<Integer> s=new Stack<>();
    System.out.println("1. Push");
    System.out.println("2. Pop");
    System.out.println("3. Peek");
    System.out.println("4. Check for empty");
    System.out.println("5. Search");
    System.out.println("6. Exit");
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
      pushBottom(s,data);
      break;

      case 2:
      if (!s.isEmpty()) {
      System.out.println(s.pop()+" was popped from the stack.");
      }
      else {
        System.out.println("The stack is currently empty.");
      }
      break;

      case 3:
      if (!s.isEmpty()) {
      System.out.println(s.peek()+" is currently top data.");
      }
      else {
        System.out.println("The stack is currently empty.");
      }
      break;

      case 4:
      System.out.println("The stack is currently empty:"+s.isEmpty());
      break;

      case 5:
      int ele;
      System.out.print("Enter the element to search in the stack:");
      ele=sc.nextInt();
      int position=s.search(ele);
      System.out.println("The element is present at :"+position);
      break;

      case 6:
      System.out.println("Exiting ....");
      break;

      default:
      System.out.println("Please enter valid option.");
    }
    } while(choice!=5);
    sc.close();
  }
}
