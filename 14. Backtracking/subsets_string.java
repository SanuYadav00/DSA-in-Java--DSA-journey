
/*  Write a program to print all the subsets of a given string */
// time complexity O(n* 2^n) = there are 2^n subsets
// and for each subset we are performing loop n times
// Space complexity O(n) = n levels are built in call stack

import java.util.*;
public class subsets_string {

 static void subsets(String s,String ans,int i) {
    
    // Base condition
    if (i==s.length()) {
      if (ans.length()!=0) {
      System.out.print(ans+" ");
      }
      else {
        System.out.print("null");
      }
      return;
    }

    // Recursion
    // Yes case
    subsets(s, ans+s.charAt(i),i+1);

    // No case
    subsets(s,ans,i+1);
  
    
    
  }
  public static void main(String args[] ) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string:");
    String s=sc.next();
    subsets(s,"",0);
    
    sc.close();
  }
}