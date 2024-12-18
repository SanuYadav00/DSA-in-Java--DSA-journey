/* Write a program to convert a bst into a balanced bst
*/
// Time complexity
import java.util.*;
public class bst_to_balanaced_bst {
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

  public static void inorder(Node root, ArrayList<Integer> a) {
    if (root==null) {
      return;
    }
    inorder(root.left,a);
    System.out.print(" "+root.data);
    a.add(root.data);
    inorder(root.right,a);
  }
  public static Node convert (ArrayList<Integer> a,int start,int end ) {
    if (start>end) {
      return null;
    }
    int mid=(start+end)/2;
    Node root=new Node(a.get(mid));
    root.left=convert(a,start,mid-1);
    root.right=convert(a,mid+1,end);
    return root;

  }
  public static Node balancedBST(Node root) {
    // inorder sequence
    ArrayList<Integer> inorder=new ArrayList<>();
    inorder(root,inorder);
    System.out.println();

    // sorted inorder -> balanced bst
    root=convert(inorder,0,inorder.size()-1);
    return root;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of nodes in the tree:");
    int n=sc.nextInt();
    Node root=null;
    System.out.print("Enter the elements of the tree:");
    for (int i=0;i<n;i++) {
       int n1=sc.nextInt();
        root=insert(root,n1);
    }
    System.out.println("The pre-order traversal of BST is:");
    preorder(root);
    System.out.println();
    System.out.println("The in-order traversal of BST is:");
    root=balancedBST(root);
    System.out.println("The pre-order traversal of BST is:");
    preorder(root);
     sc.close();
  }
}
