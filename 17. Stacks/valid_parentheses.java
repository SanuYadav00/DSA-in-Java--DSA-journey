// TC O(n)
// SC O(1)
import java.util.*;
public class valid_parentheses {
  public static boolean check(String str) {
    Stack<Character> s=new Stack<>();
    for (int i=0;i<str.length();i++) {
      char c=str.charAt(i);
      if (c=='(' || c=='{' || c=='['  ) {
        s.push(c);
      }
      else {
        if (s.isEmpty()) {
          return false;
        }
        if ( (c==')' && s.peek()=='(') || (c=='}' && s.peek()=='{') || (c==']' && s.peek()=='[') ) {
           s.pop();
        }
     else {
      return false;
     }
      }
    }
   if (s.isEmpty())  {
    return true;
   }
   else {
    return false;
   }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string of parentheses:");
    String str=sc.nextLine();
    System.out.println("The  string is a valid parentheses:"+check(str)); 
    sc.close();

  }
  
}
