/* Write a program to build a binary search tree  , perform traversal , search for a key*/
// In skewed trees , no. of nodes=height of tree , so in worst cases actions performed in BST have tc O(n)
// which is equal to O(h)
import java.util.*;
public class BST_Part1 {
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
  public static int search(Node root,int key,int level) { // O(H) where h is height of tree
    if (root==null) {
      return -1;
    }
    if (root.data==key) {
      return level;
    }
    else if (root.data>key) {
      return search(root.left,key,level+1);
    }
    else {
     return search(root.right,key,level+1);
    }


  }
  public static Node delete(Node root,int data) {
    if (root.data>data) {
      root.left=delete(root.left,data);
    }
    else if (root.data<data) {
      root.right=delete(root.right,data);
    }
    else {
      // Case 1 Leaf Node
        if (root.left==null && root.right==null) {
            return null;
        }
        // Case 2 Single Child
        if (root.left==null) {
          return root.right;
        }
        else if (root.right==null) {
          return root.left;
        }
        else {
        // case 3-both children
        Node IS=findInorderSuccessor(root.right);
        root.data=IS.data;
        root.right=delete(root.right,IS.data);
    }
  }
  return root;
  }
  public static Node findInorderSuccessor (Node root) {
    if (root.left==null) {
      return root;
    }
    return findInorderSuccessor(root.left);
  }
  public static void printInRange(Node root,int k1,int k2) {
    if (root==null) {
      return;
    }
    if (root.data>=k1 && root.data<=k2) {
      printInRange(root.left,k1,k2);
      System.out.print(" "+root.data);
      printInRange(root.right,k1,k2);
    }
    else if (root.data>k2) {
      printInRange(root.left,k1,k2);
    }
    else {
      printInRange(root.left,k1,k2);
    }
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
    // System.out.print("Enter the key which you want to search in the BST:");
    // int key=sc.nextInt();
    // int level=search(root,key,1);
    // if (level!=-1) {
    //   System.out.println("The key was found in the BST at level:"+level);
    // }
    // else {
    //   System.out.println("The key is not present in the BST.");
    // }
    // for (int i=0;i<5;i++) {
    // System.out.print("Enter the node value which you want to delete:");
    // int data=sc.nextInt();
    // root=delete(root,data);
    // System.out.println("The pre-order traversal of BST is:");
    // preorder(root);
    // System.out.println();
    // System.out.println("The in-order traversal of BST is:");
    // inorder(root);
    // System.out.println();
    // }
    System.out.print("Enter the lower bound of range:");
    int k1=sc.nextInt();
    System.out.print("Enter the upper bound of range:");
    int k2=sc.nextInt();
    System.out.print("The numbers between range of "+k1+" and "+k2+" are:");
    printInRange(root,k1,k2);
    sc.close();
  }
}