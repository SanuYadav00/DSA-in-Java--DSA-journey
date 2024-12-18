/* Write a program to print all the permutations(arrangements) of a given string */

// time complexity O(n* n!) = there are n! permutation and 
// for each permutation we are running loop n times
// Space complexity O(n) = n levels are built in call stack

import java.util.*;
public class permutation_string {

 static void permutation(String s,String ans) {
    
    // Base condition
    if (s.length()==0) {
      System.out.print(ans+" ");
      return;
    }
 
    // Recursion
    for (int i=0;i<s.length();i++) {
        char a=s.charAt(i);
        String new_s=s.substring(0,i)+s.substring(i+1);
        permutation(new_s,ans+a);

    }
  
    
    
  }
  public static void main(String args[] ) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string:");
    String s=sc.next();
    permutation(s,"");
    
    sc.close();
  }
}