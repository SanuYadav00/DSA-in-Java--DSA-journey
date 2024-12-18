/* Given a balanced expression with valid parenthese , find if it contains 
duplicate parentheses or not */
// TC O(n)
// SC O(1)

import java.util.*;
public class duplicate_parentheses {
  public static boolean check(String str) {
    Stack<Character> s=new Stack<>();
    for (int i=0;i<str.length();i++) {
      char c=str.charAt(i);
      if (c!=')' && c!='}' && c!=']'  ) {
        s.push(c);
      }
      else {
        if (c==')') {
          int j=0;
          while (s.peek()!='(') {
            s.pop();
            j++;
          }
          if (j==0) {
            return true;
          }
          else {
            s.pop();
          }

        }
        else if (c=='}') {
          int j=0;
          while (s.peek()!='{') {
            s.pop();
            j++;
          }
          if (j==0) {
            return true;
          }
          else {
            s.pop();
          }

        }
        else  {
          int j=0;
          while (s.peek()!='[') {
            s.pop();
            j++;
          }
          if (j==0) {
            return true;
          }
          else {
            s.pop();
          }

        }
      } 
    }
    return false;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a balanced expression:");
    String str=sc.nextLine();
    System.out.println("The expression contains duplicate parentheses:"+check(str)); 
    sc.close();

  }
  
}


