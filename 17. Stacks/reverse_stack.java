// We can do by creating another stack but it will take more space
// TC O(n)
// SC O(1)
import java.util.*;
public class reverse_stack {
 public static void reverse(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int d=s.pop();
    reverse(s);
    pushBottom(s,d);
  }

  public static void pushBottom(Stack<Integer> s,int data) {
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
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(8);
    s.push(9);
    s.push(10);
    s.push(11);
    s.push(12);
    reverse(s);
    while(!s.isEmpty()){
      System.out.println(s.pop());
    }
  }
}