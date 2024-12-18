/* Write a program to print the minimum distance between two given nodes of a tree */
// Time Complexity O(n)
import java.util.*;
public class min_distance_between_nodes {
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
  public static int cal(Node root,int n) {
    if (root==null) {
      return -1;
    }
    if (root.data==n) {
      return 0;
    }
    int d1=cal(root.left,n);
    int d2=cal(root.right,n);
    if(d1==-1 && d2==-1) {
      return -1;
    }
    else if(d1==-1) {
      return d2+1;
    }
    else {
      return d1+1;
    }

  }
  public static int distance(Node root,int n1,int n2) {
    Node lca=find(root,n1,n2);
    int distance1=cal(lca,n1);
    int distance2=cal(lca,n2);
    return distance1+distance2;
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
    System.out.println("The minimum distance between the nodes is:"+distance(root,n1,n2));
    sc.close();

  }
  
}
