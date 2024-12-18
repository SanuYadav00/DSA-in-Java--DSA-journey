/* Write a program to print the minimum distance between two given nodes of a tree */
// Time Complexity O(n)
import java.util.*;
public class kth_ancestor_of_node {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }
  
  public static int find(Node root,int n,int k) { 
    if (root==null) {
      return -1;
    }
    if (root.data==n) {
      return 0;
    }
    int d1=find(root.left,n,k);
    int d2=find(root.right,n,k);
    if (d1==-1 && d2==-1) {
     return -1; 
    }
    int max=Math.max(d1,d2);
    if (max+1==k) {
      System.out.println("The "+k+"th ancestor of the node is:"+root.data);
    }
    return max+1;
  }
  
  public static void main(String args[]) {
    /* 1               1
      / \             / \
     2   3           2   3
      \             / \ / \
       4           4  5 6  7
        \
         5
          \
           6        
     */
   Scanner sc=new Scanner(System.in);
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(4);
    root.left.right.right=new Node(5);
    root.left.right.right.right=new Node(6); 
    // Node root=new Node(1);;
    // root.left=new Node(2);
    // root.right=new Node(3);
    // root.left.left=new Node(4);
    // root.left.right=new Node(5);
    // root.right.left=new Node(6);
    // root.right.right=new Node(7); 
    System.out.print("Enter the node value:");
    int n=sc.nextInt();
    System.out.print("Enter the value of k:");
    int k=sc.nextInt();
    find(root,n,k);
    sc.close();

  }
  
}