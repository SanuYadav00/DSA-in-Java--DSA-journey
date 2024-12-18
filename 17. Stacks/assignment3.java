/* Decode a string
We have an encoded string s and the task is to decode it. The 
pattern in which the strings are encoded is as follows.
Sample Input 1: 2[cv]
Sample Output 1: cvcv
Sample Input 2: 3[b2[v]]L
Sample Output 2: bvvbvvbvv */
// TC O(n)
// SC O(n)
import java.util.*;
public class assignment3 {
  public static String decode(String str) {
    Stack<Integer> is=new Stack<>(); //integer-stack
    Stack<Character> ss=new Stack<>(); //string stack
    String res="";
    String temp="";
    for (int i=0;i<str.length();i++) {
      int count=0;
      char c=str.charAt(i);
      if (Character.isDigit(c)) {
        while (Character.isDigit(c)) {
        count=count*10+c-'0';
        i++;  
        }
        i--;
        is.push(count);
      }

      else if(c==']') {
        temp="";
        count=0;
        if(!is.isEmpty()) {
          count=is.peek();
          is.pop();
        }
        while(!ss.isEmpty()&& ss.peek()!='[') {
          temp=ss.peek()+temp;
          ss.pop();
        }
        if(!ss.isEmpty() && ss.peek()=='[') {
          ss.pop();
        }
        for (int j=0;j<count;j++) {
          res=res+temp;
        }
        for (int j=0;j<res.length();j++) {
          ss.push(res.charAt(j));
        }
        res="";
      }

      else if(c=='[') {
        if (Character.isDigit(str.charAt(i-1))) {
          ss.push(c);
        }
        else {
          ss.push(c);
          is.push(1);
        }

      }

      else {
        ss.push(c);
      }
      
      }

      while(!ss.isEmpty()){
        res=ss.peek()+res;
        ss.pop();
      
    }
    return res;
  
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a encoded string:");
    String s=sc.nextLine();
    String str=decode(s);
    System.out.println("The encoded string is:"+str); 
    sc.close();

  }
  
}
