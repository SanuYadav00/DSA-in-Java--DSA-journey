/* Given a string of length n of lowercase alphabet characters,we need to count total
 number of distinct substrings of this string.
 str="ababa"
 ans=10
 */
import java.util.*;
 public class count_unique_substrings {
  static class Node {
    Node children[]=new Node[26];
    boolean eow=false;

    public Node() {
      for (int i=0;i<26;i++) {
        children[i]=null;
      }
    }
  }

  public static Node root=new Node();

  public static void insert(String word) { // O(L) where l is the length of largest word
     Node curr=root;
     for (int level=0;level<word.length();level++) {
      int idx=word.charAt(level)-'a';
      if (curr.children[idx]==null) {
        curr.children[idx]=new Node();
      }
      curr=curr.children[idx];
    }
    curr.eow=true;
  }

  public static boolean search(String word) { // O(L)
    Node curr=root;
    for (int level=0;level<word.length();level++) {
      int idx=word.charAt(level)-'a';
      if (curr.children[idx]==null) {
        return false;
      }
      else {
        curr=curr.children[idx];
      }
    }
    return curr.eow==true;
  }

  public static int count(Node root) {
    if (root==null) {
      return 0;
    }
    int n=0;
    for (int i=0;i<26;i++) {
      if (root.children[i]!=null) {
        n+=count(root.children[i]);
      }
    }
    return n+1;
  }
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a string:");
   String word=sc.next();
  for (int i=0;i<word.length();i++) {
      insert(word.substring(i));
    }
  int n=count(root);
  System.out.println("The total unique substrings are: "+n);
   sc.close();
  }

  
}
