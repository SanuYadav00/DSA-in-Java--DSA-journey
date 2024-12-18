/* Given an input string and a dictionary of words, find out if the input string 
 can be broken into a space-separated sequence of dictionary words.
 words[]={i,like,sam,samsung,mobile,ice}
 key="ilikesamsung"

 output=true;
 */
// Time complexity O(L) where l is length of key
import java.util.*;
 public class word_break_problem {
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

  public static boolean wordBreak(String key) {
    if (key.length()==0) {
      return true;
    }
    for (int i=1;i<=key.length();i++) {
      if (search(key.substring(0,i)) && wordBreak(key.substring(i))) {
        return true;
      }
    }
  return false;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    // System.out.print("Enter the total no. of words in dictionary:");
    // int n=sc.nextInt();
    // String words[]=new String[n];
    // System.out.print("Enter the dictionary words:");
    String words[]={"i","like","sam","samsung","mobile","ice"};
    for (int i=0;i<words.length;i++) {
      // words[i]=sc.next();
      insert(words[i]);
    }
    // System.out.print("Enter the key:");
    // String key=sc.next();
    String key="ilikesamsung";
    boolean result=wordBreak(key);
    System.out.println("The input string can be broken into a space-separated sequence of dictionary words: "+result);
    sc.close();
  }
}
