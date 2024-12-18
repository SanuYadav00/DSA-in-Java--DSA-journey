/* Write a program to merge 2 bst and the result should be a balanced bst */
//  TC O(m+n) where m is no. of nodes in BST1 and n is no. of nodes in BST 2
import java.util.*;
public class merge_2_BSTs {
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
  public static Node insert(Node root,int data) {
    if (root==null) {
      root=new Node(data);
      return root;
    }
    if (root.data>data) {
      root.left=insert(root.left,data);
    }
    else if (root.data<data) {
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
  public static void inorder(ArrayList<Integer> a,Node root) {
    if (root==null) {
      return;
    }
    inorder(a,root.left);
    a.add(root.data);
    inorder(a,root.right);
  }
  public static void merge(ArrayList<Integer> a,ArrayList<Integer> a1,ArrayList<Integer> a2) {
    int i1=0;
    int i2=0;
    while (i1<a1.size() && i2<a2.size()) {
      if (a1.get(i1)<a2.get(i2)) {
        a.add(a1.get(i1));
        i1++;
      }
      else {
        a.add(a2.get(i2));
        i2++;
      }
    }
    while (i1<a1.size()) {
      a.add(a1.get(i1));
        i1++;
    }
    while (i2<a2.size()) {
      a.add(a2.get(i2));
        i2++;
    }

  }
  public static Node createBST(ArrayList<Integer> a,int start,int end) {
    if (start>end) {
      return null;
    }
    int mid=(start+end)/2; 
    Node root=new Node(a.get(mid));
    root.left=createBST(a,start,mid-1);
    root.right=createBST(a,mid+1,end);
    return root;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter total no. of nodes in BST 1:");
    int n1=sc.nextInt();
    Node root1=null;
    System.out.print("Enter the node values of BST 1:");
    for (int i=0;i<n1;i++) {
      int a=sc.nextInt();
      root1=insert(root1,a);
    }
    System.out.print("Enter total no. of nodes in BST 2:");
    int n2=sc.nextInt();
    Node root2=null;
    System.out.print("Enter the node values of BST 2:");
    for (int i=0;i<n2;i++) {
      int a=sc.nextInt();
      root2=insert(root2,a);
    }
    System.out.print("The pre-order traversal of BST1 is:");
    preorder(root1);
    System.out.println();
    System.out.print("The pre-order traversal of BST2 is:");
    preorder(root2);
    System.out.println();
    ArrayList<Integer> a1=new ArrayList<>();
    ArrayList<Integer> a2=new ArrayList<>();
    inorder(a1,root1);
    inorder(a2,root2);
    ArrayList<Integer> a=new ArrayList<>();
    merge(a,a1,a2);
    Node root=createBST(a,0,a.size()-1);
    System.out.print("The final BST after merging is:");
    preorder(root);
    System.out.println();
    sc.close();
  }
  
}
