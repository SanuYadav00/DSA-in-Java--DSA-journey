import java.util.*;
public class reverse_string {
  public static String rev(String str) {
    Stack<Character> s=new Stack<>();
    for (int i=0;i<str.length();i++) {
      s.push(str.charAt(i));
    }
    StringBuilder st=new StringBuilder("");
    while(!s.isEmpty()) {
      char c=s.pop();
      st.append(c);
    }
    return st.toString();
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string:");
    String str=sc.nextLine();
    System.out.println("The reverse of "+str+" is:"+rev(str));
    /* for (int i=0;i<str.length();i++) {
      s.push(str.charAt(i));
    }
    String rev=new String("");
    while(!s.isEmpty()) {
      rev+=s.pop();
    }
    System.out.println("The reverse of "+str+" is:"+rev); */
    sc.close();

  }
  
}
