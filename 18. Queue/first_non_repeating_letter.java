/* Write a program to find first non-repeating letter in a stream of characters*/
// Time complexity O(n) , inner loop will run maximum n times 
import java.util.*;
public class first_non_repeating_letter {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string:");
    String str=sc.next();
    int count[]=new int[26];
    Queue<Character> q=new ArrayDeque<>();
    for (int i=0;i<str.length();i++) {
      char c=str.charAt(i);
      q.add(c);
      count[c-'a']++;
      while(!q.isEmpty() && count[q.peek()-'a']>1) {
        q.remove();
      }
      if (!q.isEmpty()) {
      System.out.println("The first non-repeating letter is:"+q.peek());
      }
      else {
        System.out.println("The first non-repeating letter is:-1.");
      }
    }
    sc.close();
  }
  
}
