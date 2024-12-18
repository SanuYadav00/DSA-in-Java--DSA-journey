/* Write a program to print all the paths from root node to all leaf nodes of a BST  */
import java.util.*;
public class root_to_leaf_paths {
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
  public static void paths(Node root, ArrayList<Integer> a) {
       if (root==null) {
        return;
       }
       a.add(root.data);
       if (root.left==null && root.right==null) {
        System.out.println(a);
       }
       paths(root.left,a);
       paths(root.right,a);
       a.remove(a.size()-1);
       return;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of nodes you want in the BST:");
    int n=sc.nextInt();
    int array[]=new int[n];
    Node root=null;
    System.out.print("Enter node values of BST:");
    for (int i=0;i<n;i++) {
        array[i]=sc.nextInt();
        root=insert(root,array[i]);
    }
    System.out.println("The pre-order traversal of BST is:");
    preorder(root);
    System.out.println();
    System.out.println("The in-order traversal of BST is:");
    inorder(root);
    System.out.println();
    ArrayList<Integer> al=new ArrayList<>();
    System.out.print("All the paths from root node to leaf nodes are given below:");
    paths(root,al);
     sc.close();
  }
}
