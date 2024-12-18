/* Create a function boolean startsWith(String prefix) for a trie.
 Returns true if there is a previously inserted string word that has the prefix
 otherwise.
 words[]={"apple","app","mango","man","woman"}
 prefix="app" output=true;
 prefix="moon" output:false;
 */
// TC O(L)
import java.util.*;
 public class starts_with_problem {
  static class Node {
    Node children[]=new Node[26];
    boolean eow=false;
    int freq;

    public Node() {
      for (int i=0;i<26;i++) {
        children[i]=null;
      }
      freq=1;
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
      else {
      curr.children[idx].freq++;
      }
      curr=curr.children[idx];
    }
    curr.eow=true;
  }
  public static boolean startsWith(String prefix) {
    Node curr=root;
    for (int i=0;i<prefix.length();i++) {
      int idx=prefix.charAt(i)-'a';
        if (curr.children[idx]==null) {
          return false;
        }
        curr=curr.children[idx];
    }
    return true;
  }
  
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String words[]={"apple","app","mango","man","woman"};
    for (int i=0;i<words.length;i++) {
      insert(words[i]);
    }
    System.out.print("Enter a prefix:");
    String prefix=sc.next();
    boolean ans=startsWith(prefix);
    System.out.println("There is a previously inserted string word that has the given prefix:"+ans);
    sc.close();
  }
  
  
}
