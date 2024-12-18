/* Write a program to find the minimum distance (no. of edges) between two nodes of a tree */
// Time Complexity O(n)
// It requires less space than previous method SC O(n)
import java.util.*;
public class lowest_common_ancestor2 {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }
  
  public static Node find(Node root,int n1,int n2) { // )(n)
    if (root==null || root.data==n1 || root.data==n2) {
      return root;
    }
    Node leftLCA=find(root.left,n1,n2);
    Node rightLCA=find(root.right,n1,n2);
    if (leftLCA==null) {
      return rightLCA;
    }
    if (rightLCA==null) {
      return leftLCA;
    }
    return root;
  }

  
  public static void main(String args[]) {
    /* 1        2
      / \      / \
     2   3    4   5
      \   
       4
        \
         5
          \
           6        
     */
   Scanner sc=new Scanner(System.in);
    /*Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(4);
    root.left.right.right=new Node(5);
    root.left.right.right.right=new Node(6); */
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.right=new Node(6);
    System.out.print("Enter first node value:");
    int n1=sc.nextInt();
    System.out.print("Enter second node value:");
    int n2=sc.nextInt();
    System.out.println("The lowest common ancestor of the two nodes is:"+find(root,n1,n2).data);
    sc.close();

  }
  
}
