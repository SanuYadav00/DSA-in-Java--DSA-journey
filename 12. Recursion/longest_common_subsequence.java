/* A subsequence of a string is a new string generated from the original string with
 some characters (can be none) deleted without changing the relative order of the 
 remaining characters. Find the length of longest common subsequence between two strings.
 Sample input1: str1="abcde" str2="ace"
 ans=3 // "ace"

 Sample input2: str1="abcdge" str2="abedg"
 ans=4 //"abdg"

 TC O(2^(m+n)) where m is the length of the first string and n is the length of the second string
*/
import java.util.*;
public class longest_common_subsequence {
  public static int lcs(String a, String b, int m, int n) {
    if (m==0 || n==0 ) {
      return 0;
    }
    if (a.charAt(m-1)==b.charAt(n-1)) { // same
      return 1+lcs(a,b,m-1,n-1);
    }
    else { // diff
      int l1=lcs(a,b,m-1,n);
      int l2=lcs(a,b,m,n-1);
      return Math.max(l1,l2);
    }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String s1=sc.next();
    System.out.print("Enter second string:");
    String s2=sc.next();
    System.out.println("The length of longest common subsequence is:"+lcs(s1,s2,s1.length(),s2.length()));
    sc.close();
  }
}
