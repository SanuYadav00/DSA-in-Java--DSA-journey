/* Write a program to check if a BST is valid or not  */
import java.util.*;
public class size_of_largest_bst_in_bt {
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
  public static class info {
    boolean isBST;
    int size;
    int min;
    int max;
    public info(boolean isBST,int size,int min,int max) {
      this.isBST=isBST;
      this.size=size;
      this.min=min;
      this.max=max;
    }
  }
  public static int maxBST=0;

  public static info largestBST(Node root) {
    if (root==null) {
      return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
      info leftInfo=largestBST(root.left);
      info rightInfo=largestBST(root.right);
      int size=leftInfo.size+rightInfo.size+1;
      int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
      int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

      if (root.data<=leftInfo.max || root.data>=rightInfo.min) {
        return new info(false,size,min,max);
      }
      if (leftInfo.isBST && rightInfo.isBST) {
        maxBST=Math.max(maxBST,size);
        return new info(true,size,min,max);
      }
      return new info(false,size,min,max);

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
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    Node root=new Node(50);;
    root.left=new Node(30);
    root.right=new Node(60);
    root.left.left=new Node(5);
    root.left.right=new Node(20);
    root.right.left=new Node(45);
    root.right.right=new Node(70);
    root.right.right.left=new Node(65);
    root.right.right.right=new Node(80);
    System.out.println("The pre-order traversal of BST is:");
    preorder(root);
    System.out.println();
    System.out.println("The in-order traversal of BST is:");
    inorder(root);
    System.out.println();
    info s=largestBST(root);
    System.out.print("The size of largest bst in given binary tree is:"+maxBST);
     sc.close();
  }
}