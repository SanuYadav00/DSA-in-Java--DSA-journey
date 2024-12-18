/* Write a program to check if a BST is valid or not  */
import java.util.*;
public class valid_BST {
  public static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  public static Node insert(Node root,int data) { // O(H)
    if (root==null) {
      root=new Node(data);
      return root;
    }
    if (data<root.data) {
      root.left=insert(root.left,data);
    }
    else {
      root.right=insert(root.right,data);
    }
    return root;
  }
  public static void preorder(Node root) {
    if (root==null) {
      return;
    }
    System.out.print(" "+root.data);
    preorder(root.left);
    preorder(root.right);
  }

  public static void inorder(Node root) {
    if (root==null) {
      return;
    }
    inorder(root.left);
    System.out.print(" "+root.data);
    inorder(root.right);
  }
  public static boolean valid(Node root, Node min, Node max) {
       if (root==null) {
        return true;
       }
       if (min!=null && root.data<=min.data) {
        return false;
       }
       else if (max!=null && root.data>=max.data) {
        return false;
       }
       
       return valid(root.left,min,root)
              && valid(root.right,root,max);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    // System.out.print("Enter the total no. of nodes you want in the BST:");
    // int n=sc.nextInt();
    // int array[]=new int[n];
    // Node root=null;
    // System.out.print("Enter node values of BST:");
    // for (int i=0;i<n;i++) {
    //     array[i]=sc.nextInt();
    //     root=insert(root,array[i]);
    // }
    Node root=new Node(4);;
    root.left=new Node(2);
    root.right=new Node(5);
    root.left.left=new Node(1);
    root.left.right=new Node(3);
    System.out.println("The pre-order traversal of BST is:");
    preorder(root);
    System.out.println();
    System.out.println("The in-order traversal of BST is:");
    inorder(root);
    System.out.println();
    System.out.print("The given BST is valid:"+valid(root,null,null));
     sc.close();
  }
}
