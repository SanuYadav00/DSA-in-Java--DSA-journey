/* Write a program to find the shortest unique prefix for every word in a given list.
 Assume no word is prefix of another.
 arr[]={"zebra","dog","duck","dove"}
 ans={"z","dog","du","dov"}
 */
// TC O(L) length of longest word
import java.util.*;
 public class prefix_problem {
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

  public static void findPrefix(Node root,String ans) { // O(L)
    if (root==null) {
      return;
    }
    if (root.freq==1) {
      System.out.println(ans);
      return;
    }
    for (int i=0;i<root.children.length;i++) {
      if (root.children[i]!=null) {
        findPrefix(root.children[i],ans+(char)(i+'a'));
      }
    }
  }

  
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String words[]={"zebra","dog","duck","dove","zoo"};
    for (int i=0;i<words.length;i++) {
      insert(words[i]);
    }
    root.freq=-1;
    findPrefix(root,"");
    sc.close();
  }
  
}



// Second method
// import java.util.*;
//  public class prefix_problem {
//   static class Node {
//     Node children[]=new Node[26];
//     boolean eow=false;

//     public Node() {
//       for (int i=0;i<26;i++) {
//         children[i]=null;
//       }
//     }
//   }

//   public static Node root=new Node();

//   public static void insert(String word) { // O(L) where l is the length of largest word
//      Node curr=root;
//      for (int level=0;level<word.length();level++) {
//       int idx=word.charAt(level)-'a';
//       if (curr.children[idx]==null) {
//         curr.children[idx]=new Node();
//       }
//       curr=curr.children[idx];
//     }
//     curr.eow=true;
//   }

//   public static String search(String word) { // O(L)
//     Node curr=root;
//     String ans="";
//     for (int level=0;level<word.length();level++) {
//       int idx=word.charAt(level)-'a';
//       ans+=word.charAt(level);
//       curr=curr.children[idx];
//       int count=0;
//       for (int i=0;i<26;i++) {
//         if (curr.children[i]!=null) {
//           count++;
//         }
//       }
//       if (count<2) {
//         return ans;
//       }
//     }
//     return word;
      
//   }

  
//   public static void main(String args[]) {
//     Scanner sc=new Scanner(System.in);
//     // System.out.print("Enter the total no. of words in dictionary:");
//     // int n=sc.nextInt();
//     // String words[]=new String[n];
//     // System.out.print("Enter the dictionary words:");
//     String words[]={"zebra","dog","duck","dove","zoo"};
//     for (int i=0;i<words.length;i++) {
//       // words[i]=sc.next();
//       insert(words[i]);
//     }
//     String prefix[]={"","","","",""};
//     for (int i=0;i<prefix.length;i++) {
//        prefix[i]=search(words[i]);
//     }
//     System.out.println("The shortest unique prefix for every word in the given list is:");
//     for (int i=0;i<prefix.length;i++) {
//        System.out.println(prefix[i]);
//     }
//     sc.close();
//   }
  
// }
