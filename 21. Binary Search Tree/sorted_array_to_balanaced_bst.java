/* Write a program to convert a sorted array into a balanced bst
 Height of the tree should be as minimum as possible
*/
  import java.util.*;
  public class sorted_array_to_balanaced_bst {
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
    public static Node insert(int array[],int start,int end) {
      if (start>end) {
        return null;
      } 
      int mid=(start+end)/2;
      Node root=new Node(array[mid]);
      root.left=insert(array,start,mid-1);
      root.right=insert(array,mid+1,end);
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
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the total no. of elements in the array:");
      int n=sc.nextInt();
      int array[]=new int[n];
      System.out.print("Enter the elements of the sorted array:");
      for (int i=0;i<n;i++) {
          array[i]=sc.nextInt();
      }
      Node root=insert(array,0,n-1);
      System.out.println("The pre-order traversal of BST is:");
    preorder(root);
    System.out.println();
    System.out.println("The in-order traversal of BST is:");
    inorder(root);
    System.out.println();
       sc.close();
    }
  }
  